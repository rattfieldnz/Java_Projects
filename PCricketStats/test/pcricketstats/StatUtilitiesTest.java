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
public class StatUtilitiesTest {
    
    public StatUtilitiesTest() {
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
     * Test of listNPlayers method, of class StatUtilities.
     */
    @Test
    public void testListNPlayers_ArrayList_int() {
        System.out.println("listNPlayers");
        ArrayList<Player> players = null;
        int noOfPlayers = 0;
        StatUtilities instance = new StatUtilities();
        instance.listNPlayers(players, noOfPlayers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listNPlayers method, of class StatUtilities.
     */
    @Test
    public void testListNPlayers_3args() {
        System.out.println("listNPlayers");
        ArrayList<Player> players = null;
        int start = 0;
        int end = 0;
        StatUtilities instance = new StatUtilities();
        instance.listNPlayers(players, start, end);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aveInningsPerCountry method, of class StatUtilities.
     */
    @Test
    public void testAveInningsPerCountry() {
        System.out.println("aveInningsPerCountry");
        ArrayList<Player> players = null;
        String country = "";
        StatUtilities instance = new StatUtilities();
        double expResult = 0.0;
        double result = instance.aveInningsPerCountry(players, country);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aveInningsPerPlayer method, of class StatUtilities.
     */
    @Test
    public void testAveInningsPerPlayer() {
        System.out.println("aveInningsPerPlayer");
        ArrayList<Player> players = null;
        StatUtilities instance = new StatUtilities();
        double expResult = 0.0;
        double result = instance.aveInningsPerPlayer(players);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aveWickets method, of class StatUtilities.
     */
    @Test
    public void testAveWickets_ArrayList() {
        System.out.println("aveWickets");
        ArrayList<Player> players = null;
        StatUtilities instance = new StatUtilities();
        double expResult = 0.0;
        double result = instance.aveWickets(players);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aveWickets method, of class StatUtilities.
     */
    @Test
    public void testAveWickets_ArrayList_String() {
        System.out.println("aveWickets");
        ArrayList<Player> players = null;
        String country = "";
        StatUtilities instance = new StatUtilities();
        double expResult = 0.0;
        double result = instance.aveWickets(players, country);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aveEconRate method, of class StatUtilities.
     */
    @Test
    public void testAveEconRate_ArrayList() {
        System.out.println("aveEconRate");
        ArrayList<Player> players = null;
        StatUtilities instance = new StatUtilities();
        double expResult = 0.0;
        double result = instance.aveEconRate(players);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aveEconRate method, of class StatUtilities.
     */
    @Test
    public void testAveEconRate_ArrayList_String() {
        System.out.println("aveEconRate");
        ArrayList<Player> players = null;
        String country = "";
        StatUtilities instance = new StatUtilities();
        double expResult = 0.0;
        double result = instance.aveEconRate(players, country);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aveBallsBowled method, of class StatUtilities.
     */
    @Test
    public void testAveBallsBowled_ArrayList() {
        System.out.println("aveBallsBowled");
        ArrayList<Player> players = null;
        StatUtilities instance = new StatUtilities();
        double expResult = 0.0;
        double result = instance.aveBallsBowled(players);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aveBallsBowled method, of class StatUtilities.
     */
    @Test
    public void testAveBallsBowled_ArrayList_String() {
        System.out.println("aveBallsBowled");
        ArrayList<Player> players = null;
        String country = "";
        StatUtilities instance = new StatUtilities();
        double expResult = 0.0;
        double result = instance.aveBallsBowled(players, country);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aveStrikeRate method, of class StatUtilities.
     */
    @Test
    public void testAveStrikeRate_ArrayList() {
        System.out.println("aveStrikeRate");
        ArrayList<Player> players = null;
        StatUtilities instance = new StatUtilities();
        double expResult = 0.0;
        double result = instance.aveStrikeRate(players);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aveStrikeRate method, of class StatUtilities.
     */
    @Test
    public void testAveStrikeRate_ArrayList_String() {
        System.out.println("aveStrikeRate");
        ArrayList<Player> players = null;
        String country = "";
        StatUtilities instance = new StatUtilities();
        double expResult = 0.0;
        double result = instance.aveStrikeRate(players, country);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listPlayersCountry method, of class StatUtilities.
     */
    @Test
    public void testListPlayersCountry() {
        System.out.println("listPlayersCountry");
        ArrayList<Player> players = null;
        String country = "";
        StatUtilities instance = new StatUtilities();
        String expResult = "";
        String result = instance.listPlayersCountry(players, country);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of outputSort method, of class StatUtilities.
     */
    @Test
    public void testOutputSort() {
        System.out.println("outputSort");
        ArrayList<Player> players = null;
        int chosenOption = 0;
        StatUtilities instance = new StatUtilities();
        instance.outputSort(players, chosenOption);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}