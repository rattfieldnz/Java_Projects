package pcricketstats;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

/*  This class is borrowed from http://tips4java.wordpress.com/2008/11/10/table-column-adjuster/. I couldn't 
 *  find a way to resize certain columns, given the creation of the custom table model (tableModel). When I 
 *  have time, I'll create a better table model (create an external class that can be instantiated).
 *  Class to manage the widths of colunmns in a table.
 *
 *  Various properties control how the width of the column is calculated.
 *  Another property controls whether column width calculation should be dynamic.
 *  Finally, various Actions will be added to the table to allow the user
 *  to customize the functionality.
 *
 *  This class was designed to be used with tables that use an auto resize mode
 *  of AUTO_RESIZE_OFF. With all other modes you are constrained as the width
 *  of the columns must fit inside the table. So if you increase one column, one
 *  or more of the other columns must decrease. Because of this the resize mode
 *  of RESIZE_ALL_COLUMNS will work the best.
 */
public class TableColumnAdjuster implements PropertyChangeListener, TableModelListener {

    private JTable table;
    private int spacing;
    private boolean isColumnHeaderIncluded;
    private boolean isColumnDataIncluded;
    private boolean isOnlyAdjustLarger;
    private boolean isDynamicAdjustment;
    private Map<TableColumn, Integer> columnSizes = new HashMap<TableColumn, Integer>();

    /*
     *  Specify the table and use default spacing
     */
    /**
     * Constructor to set default width of columns with default spacing of 6.
     * @param table The table for which columns are to be adjusted.
     */
    public TableColumnAdjuster(JTable table) {
        this(table, 6);
    }

    /*
     *  Specify the table and spacing
     */
    
    /**
     * An overloaded constructor that you can use to 
     * customize the spacing between columns - when 
     * adjusting column widths.
     * @param table The table for which columns are to be adjusted.
     * @param spacing The spacing amount for each column.
     */
    public TableColumnAdjuster(JTable table, int spacing) {
        this.table = table;
        this.spacing = spacing;
        setColumnHeaderIncluded(true);
        setColumnDataIncluded(true);
        setOnlyAdjustLarger(true);
        setDynamicAdjustment(false);
        installActions();
    }

    /*
     *  Adjust the widths of all the columns in the table
     */
    public void adjustColumns() {
        TableColumnModel tcm = table.getColumnModel();

        for (int i = 0; i < tcm.getColumnCount(); i++) {
            adjustColumn(i);
        }
    }

    /*
     *  Adjust the width of the specified column in the table
     */
    /**
     * This method adjusts a single column, specified by a column number.
     * @param column The single column to be adjusted.
     */
    public void adjustColumn(final int column) {
        TableColumn tableColumn = table.getColumnModel().getColumn(column);

        if (!tableColumn.getResizable()) {
            return;
        }

        int columnHeaderWidth = getColumnHeaderWidth(column);
        int columnDataWidth = getColumnDataWidth(column);
        int preferredWidth = Math.max(columnHeaderWidth, columnDataWidth);

        updateTableColumn(column, preferredWidth);
    }

    /*
     *  Calculated the width based on the column name
     */
    /**
     * This method returns a width of a given column.
     * @param column The column you want to get the width of.
     * @return The specified column's width.
     */
    private int getColumnHeaderWidth(int column) {
        if (!isColumnHeaderIncluded) {
            return 0;
        }

        TableColumn tableColumn = table.getColumnModel().getColumn(column);
        Object value = tableColumn.getHeaderValue();
        TableCellRenderer renderer = tableColumn.getHeaderRenderer();

        if (renderer == null) {
            renderer = table.getTableHeader().getDefaultRenderer();
        }

        Component c = renderer.getTableCellRendererComponent(table, value, false, false, -1, column);
        return c.getPreferredSize().width;
    }

    /*
     *  Calculate the width based on the widest cell renderer for the
     *  given column.
     */
    /**
     * This method gets the width of the column, based on the maximum width of a column's cell.
     * @param column The column to get the column data width.
     * @return The column's data width.
     */
    private int getColumnDataWidth(int column) {
        if (!isColumnDataIncluded) {
            return 0;
        }

        int preferredWidth = 0;
        int maxWidth = table.getColumnModel().getColumn(column).getMaxWidth();

        for (int row = 0; row < table.getRowCount(); row++) {
            preferredWidth = Math.max(preferredWidth, getCellDataWidth(row, column));

            //  We've exceeded the maximum width, no need to check other rows

            if (preferredWidth >= maxWidth) {
                break;
            }
        }

        return preferredWidth;
    }

    /*
     *  Get the preferred width for the specified cell
     */
    /**
     * This method gets the width of a cell, specified by a column 
     * and row number.
     * @param row The column number.
     * @param column The row number.
     * @return The width of the cell data.
     */
    private int getCellDataWidth(int row, int column) {
        //  Inovke the renderer for the cell to calculate the preferred width

        TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
        Component c = table.prepareRenderer(cellRenderer, row, column);
        int width = c.getPreferredSize().width + table.getIntercellSpacing().width;

        return width;
    }

    /**
     * This method updates the specified TableColumn with the newly calculated width
     * @param column The column to update.
     * @param width The width to update the column width with.
     */
    private void updateTableColumn(int column, int width) {
        final TableColumn tableColumn = table.getColumnModel().getColumn(column);

        if (!tableColumn.getResizable()) {
            return;
        }

        width += spacing;

        //  Don't shrink the column width

        if (isOnlyAdjustLarger) {
            width = Math.max(width, tableColumn.getPreferredWidth());
        }

        columnSizes.put(tableColumn, new Integer(tableColumn.getWidth()));
        table.getTableHeader().setResizingColumn(tableColumn);
        tableColumn.setWidth(width);
    }

    /*
     *  Restore the widths of the columns in the table to its previous width
     */
    public void restoreColumns() {
        TableColumnModel tcm = table.getColumnModel();

        for (int i = 0; i < tcm.getColumnCount(); i++) {
            restoreColumn(i);
        }
    }

    /**
     * This method restores the width of the specified column to its previous width.
     * @param column  The column to restore.
     */
    private void restoreColumn(int column) {
        TableColumn tableColumn = table.getColumnModel().getColumn(column);
        Integer width = columnSizes.get(tableColumn);

        if (width != null) {
            table.getTableHeader().setResizingColumn(tableColumn);
            tableColumn.setWidth(width.intValue());
        }
    }

    /**
     * This method indicates whether to include the header in the width calculation.
     * @param isColumnHeaderIncluded The boolean value to determine whether the 
     * column header is to be included in width calculations.
     */
    public void setColumnHeaderIncluded(boolean isColumnHeaderIncluded) {
        this.isColumnHeaderIncluded = isColumnHeaderIncluded;
    }

    /**
     * This method indicates whether to include the model data in the width calculation.
     * @param isColumnDataIncluded A Boolean value to determine if the column data should 
     * be included in width calculations.
     */
    public void setColumnDataIncluded(boolean isColumnDataIncluded) {
        this.isColumnDataIncluded = isColumnDataIncluded;
    }

    /**
     * This method indicates whether columns can only be increased in size.
     * @param isOnlyAdjustLarger Boolean value to determine if columns can 
     * only be increased in size.
     */
    public void setOnlyAdjustLarger(boolean isOnlyAdjustLarger) {
        this.isOnlyAdjustLarger = isOnlyAdjustLarger;
    }

    /*
     *  Indicate whether changes to the model should cause the width to be
     *  dynamically recalculated.
     */
    /**
     * This method indicates whether changes to the model should cause the width to be
     * dynamically recalculated.
     * @param isDynamicAdjustment Boolean value to determine if the width should be 
     * dynamically calculated
     */
    public void setDynamicAdjustment(boolean isDynamicAdjustment) {
        //  May need to add or remove the TableModelListener when changed

        if (this.isDynamicAdjustment != isDynamicAdjustment) {
            if (isDynamicAdjustment) {
                table.addPropertyChangeListener(this);
                table.getModel().addTableModelListener(this);
            } else {
                table.removePropertyChangeListener(this);
                table.getModel().removeTableModelListener(this);
            }
        }

        this.isDynamicAdjustment = isDynamicAdjustment;
    }
//
//  Implement the PropertyChangeListener
//

    /**
     * This method implements the PropertyChangeListener
     * @param e The event to listen for.
     */
    @Override
    public void propertyChange(PropertyChangeEvent e) {
        //  When the TableModel changes we need to update the listeners
        //  and column widths

        if ("model".equals(e.getPropertyName())) {
            TableModel model = (TableModel) e.getOldValue();
            model.removeTableModelListener(this);

            model = (TableModel) e.getNewValue();
            model.addTableModelListener(this);
            adjustColumns();
        }
    }
//
//  Implement the TableModelListener
//

    /**
     * This method implements the TableModelListener
     * @param e The event to listen for.
     */
    @Override
    public void tableChanged(TableModelEvent e) {
        if (!isColumnDataIncluded) {
            return;
        }

        //  A cell has been updated

        if (e.getType() == TableModelEvent.UPDATE) {
            int column = table.convertColumnIndexToView(e.getColumn());

            //  Only need to worry about an increase in width for this cell

            if (isOnlyAdjustLarger) {
                int row = e.getFirstRow();
                TableColumn tableColumn = table.getColumnModel().getColumn(column);

                if (tableColumn.getResizable()) {
                    int width = getCellDataWidth(row, column);
                    updateTableColumn(column, width);
                }
            } //	Could be an increase of decrease so check all rows
            else {
                adjustColumn(column);
            }
        } //  The update affected more than one column so adjust all columns
        else {
            adjustColumns();
        }
    }

    /*
     *  Install Actions to give user control of certain functionality.
     */
    private void installActions() {
        installColumnAction(true, true, "adjustColumn", "control ADD");
        installColumnAction(false, true, "adjustColumns", "control shift ADD");
        installColumnAction(true, false, "restoreColumn", "control SUBTRACT");
        installColumnAction(false, false, "restoreColumns", "control shift SUBTRACT");

        installToggleAction(true, false, "toggleDynamic", "control MULTIPLY");
        installToggleAction(false, true, "toggleLarger", "control DIVIDE");
    }

    /**
     * This method updates the input and action maps with a new ColumnAction.
     * @param isSelectedColumn
     * @param isAdjust
     * @param key
     * @param keyStroke 
     */
    private void installColumnAction(
            boolean isSelectedColumn, boolean isAdjust, String key, String keyStroke) {
        Action action = new ColumnAction(isSelectedColumn, isAdjust);
        KeyStroke ks = KeyStroke.getKeyStroke(keyStroke);
        table.getInputMap().put(ks, key);
        table.getActionMap().put(key, action);
    }

    /**
     * This method updates the input and action maps with new ToggleAction.
     * @param isToggleDynamic
     * @param isToggleLarger
     * @param key
     * @param keyStroke 
     */
    private void installToggleAction(
            boolean isToggleDynamic, boolean isToggleLarger, String key, String keyStroke) {
        Action action = new ToggleAction(isToggleDynamic, isToggleLarger);
        KeyStroke ks = KeyStroke.getKeyStroke(keyStroke);
        table.getInputMap().put(ks, key);
        table.getActionMap().put(key, action);
    }

    /*
     *  Action to adjust or restore the width of a single column or all columns
     */
    class ColumnAction extends AbstractAction {

        private boolean isSelectedColumn;
        private boolean isAdjust;

        public ColumnAction(boolean isSelectedColumn, boolean isAdjust) {
            this.isSelectedColumn = isSelectedColumn;
            this.isAdjust = isAdjust;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //  Handle selected column(s) width change actions

            if (isSelectedColumn) {
                int[] columns = table.getSelectedColumns();

                for (int i = 0; i < columns.length; i++) {
                    if (isAdjust) {
                        adjustColumn(columns[i]);
                    } else {
                        restoreColumn(columns[i]);
                    }
                }
            } else {
                if (isAdjust) {
                    adjustColumns();
                } else {
                    restoreColumns();
                }
            }
        }
    }

    /*
     *  Toggle properties of the TableColumnAdjuster so the user can
     *  customize the functionality to their preferences
     */
    class ToggleAction extends AbstractAction {

        private boolean isToggleDynamic;
        private boolean isToggleLarger;

        public ToggleAction(boolean isToggleDynamic, boolean isToggleLarger) {
            this.isToggleDynamic = isToggleDynamic;
            this.isToggleLarger = isToggleLarger;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (isToggleDynamic) {
                setDynamicAdjustment(!isDynamicAdjustment);
                return;
            }

            if (isToggleLarger) {
                setOnlyAdjustLarger(!isOnlyAdjustLarger);
            }
        }
    }
}
