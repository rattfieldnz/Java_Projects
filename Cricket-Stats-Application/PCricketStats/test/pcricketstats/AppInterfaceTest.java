/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.ArrayList;
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
public class AppInterfaceTest {
    
    public AppInterfaceTest() {
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
     * Test of resetOverallAverages method, of class AppInterface.
     */
    @Test
    public void testResetOverallAverages() {
        System.out.println("resetOverallAverages");
        AppInterface instance = null;
        instance.resetOverallAverages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndexOf method, of class AppInterface.
     */
    @Test
    public void testGetIndexOf() {
        System.out.println("getIndexOf");
        String[] options = null;
        String option = "";
        AppInterface instance = null;
        int expResult = 0;
        int result = instance.getIndexOf(options, option);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStatsToAveragesPanel method, of class AppInterface.
     */
    @Test
    public void testAddStatsToAveragesPanel() {
        System.out.println("addStatsToAveragesPanel");
        ArrayList<Player> players = null;
        AppInterface instance = null;
        instance.addStatsToAveragesPanel(players);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawTable method, of class AppInterface.
     */
    @Test
    public void testDrawTable_0args() {
        System.out.println("drawTable");
        AppInterface instance = null;
        instance.drawTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawTable method, of class AppInterface.
     */
    @Test
    public void testDrawTable_int_int() {
        System.out.println("drawTable");
        int start = 0;
        int end = 0;
        AppInterface instance = null;
        instance.drawTable(start, end);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawTable method, of class AppInterface.
     */
    @Test
    public void testDrawTable_int() {
        System.out.println("drawTable");
        int firstNPlayers = 0;
        AppInterface instance = null;
        instance.drawTable(firstNPlayers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawReverseTable method, of class AppInterface.
     */
    @Test
    public void testDrawReverseTable() {
        System.out.println("drawReverseTable");
        int lastXPlayers = 0;
        AppInterface instance = null;
        instance.drawReverseTable(lastXPlayers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawTable method, of class AppInterface.
     */
    @Test
    public void testDrawTable_String() {
        System.out.println("drawTable");
        String country = "";
        AppInterface instance = null;
        instance.drawTable(country);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawSortedTable method, of class AppInterface.
     */
    @Test
    public void testDrawSortedTable() {
        System.out.println("drawSortedTable");
        int sortOption = 0;
        AppInterface instance = null;
        instance.drawSortedTable(sortOption);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class AppInterface.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int row = 0;
        int col = 0;
        AppInterface instance = null;
        Object expResult = null;
        Object result = instance.getValueAt(row, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processCvCchart method, of class AppInterface.
     */
    @Test
    public void testProcessCvCchart() {
        System.out.println("processCvCchart");
        int option = 0;
        AppInterface instance = null;
        instance.processCvCchart(option);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AppInterface.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AppInterface.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}