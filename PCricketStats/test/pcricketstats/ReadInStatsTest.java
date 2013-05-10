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
public class ReadInStatsTest {
    
    public ReadInStatsTest() {
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
     * Test of load method, of class ReadInStats.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        ArrayList<Player> players = null;
        ReadInStats instance = new ReadInStats();
        instance.load(players);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}