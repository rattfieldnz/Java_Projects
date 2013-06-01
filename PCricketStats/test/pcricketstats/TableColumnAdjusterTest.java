/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.beans.PropertyChangeEvent;
import javax.swing.event.TableModelEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author interkiwiwebdev
 */
public class TableColumnAdjusterTest {
    
    public TableColumnAdjusterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of adjustColumns method, of class TableColumnAdjuster.
     */
    @Test
    public void testAdjustColumns() {
        System.out.println("adjustColumns");
        TableColumnAdjuster instance = null;
        instance.adjustColumns();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adjustColumn method, of class TableColumnAdjuster.
     */
    @Test
    public void testAdjustColumn() {
        System.out.println("adjustColumn");
        int column = 0;
        TableColumnAdjuster instance = null;
        instance.adjustColumn(column);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restoreColumns method, of class TableColumnAdjuster.
     */
    @Test
    public void testRestoreColumns() {
        System.out.println("restoreColumns");
        TableColumnAdjuster instance = null;
        instance.restoreColumns();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumnHeaderIncluded method, of class TableColumnAdjuster.
     */
    @Test
    public void testSetColumnHeaderIncluded() {
        System.out.println("setColumnHeaderIncluded");
        boolean isColumnHeaderIncluded = false;
        TableColumnAdjuster instance = null;
        instance.setColumnHeaderIncluded(isColumnHeaderIncluded);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumnDataIncluded method, of class TableColumnAdjuster.
     */
    @Test
    public void testSetColumnDataIncluded() {
        System.out.println("setColumnDataIncluded");
        boolean isColumnDataIncluded = false;
        TableColumnAdjuster instance = null;
        instance.setColumnDataIncluded(isColumnDataIncluded);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOnlyAdjustLarger method, of class TableColumnAdjuster.
     */
    @Test
    public void testSetOnlyAdjustLarger() {
        System.out.println("setOnlyAdjustLarger");
        boolean isOnlyAdjustLarger = false;
        TableColumnAdjuster instance = null;
        instance.setOnlyAdjustLarger(isOnlyAdjustLarger);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDynamicAdjustment method, of class TableColumnAdjuster.
     */
    @Test
    public void testSetDynamicAdjustment() {
        System.out.println("setDynamicAdjustment");
        boolean isDynamicAdjustment = false;
        TableColumnAdjuster instance = null;
        instance.setDynamicAdjustment(isDynamicAdjustment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of propertyChange method, of class TableColumnAdjuster.
     */
    @Test
    public void testPropertyChange() {
        System.out.println("propertyChange");
        PropertyChangeEvent e = null;
        TableColumnAdjuster instance = null;
        instance.propertyChange(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tableChanged method, of class TableColumnAdjuster.
     */
    @Test
    public void testTableChanged() {
        System.out.println("tableChanged");
        TableModelEvent e = null;
        TableColumnAdjuster instance = null;
        instance.tableChanged(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}