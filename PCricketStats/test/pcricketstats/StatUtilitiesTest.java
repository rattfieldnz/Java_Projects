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
    
    public String csvHeader = "Player ID | Player | Country | Career Span | Matches Played | Innings Played | Balls Bowled | Runs Conceded | "
            + "Wickets Taken | Bowling Average | Economy Rate | Strike Rate | 5 Wickets/Match";
    
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
        ArrayList<Player> players = new ArrayList<Player>();
        ReadInStats worker = new ReadInStats();
        worker.load(players);
        ArrayList<Player> testPlayers = new ArrayList<Player>();
        int noOfPlayers = 5;
        
        for(int i = 0; i < noOfPlayers; i++)
        {
            testPlayers.add(players.get(i));
        }

        StatUtilities instance = new StatUtilities();
        
        String expResult = instance.listNPlayers(players, noOfPlayers);
        String result = instance.listNPlayers(testPlayers, noOfPlayers);
        
        
        assertEquals(expResult, result);
        
        
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
        
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        
        String country = "New Zealand";
        double expResult = 74.11;
        double result = instance.aveInningsPerCountry(players, country);
        assertEquals(expResult, result, 0.0);
        
        String country2 = "";
        double expResult2 = 0.0;
        double result2 = instance.aveInningsPerCountry(players, country2);
        assertEquals(expResult2, result2, 0.0);
        
        String country3 = "kdjbglejkhdgfkjahsdb";
        double expResult3 = 0.0;
        double result3 = instance.aveInningsPerCountry(players, country3);
        assertEquals(expResult3, result3, 0.0);
    }

    /**
     * Test of aveInningsPerPlayer method, of class StatUtilities.
     */
    @Test
    public void testAveInningsPerPlayer() {
        System.out.println("aveInningsPerPlayer");
        
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        
        double expResult = 67.41;
        double result = instance.aveInningsPerPlayer(players);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of aveWickets method, of class StatUtilities.
     */
    @Test
    public void testAveWickets_ArrayList() {
        System.out.println("aveWickets");
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        
        double expResult = 75.63;
        double result = instance.aveWickets(players);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of aveWickets method, of class StatUtilities.
     */
    @Test
    public void testAveWickets_ArrayList_String() {
        System.out.println("aveWickets");
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        
        String country = "New Zealand";
        double expResult = 80.05;
        double result = instance.aveWickets(players, country);
        assertEquals(expResult, result, 0.0);
        
        String country2 = "";
        double expResult2 = 0.0;
        double result2 = instance.aveWickets(players, country2);
        assertEquals(expResult2, result2, 0.0);
        
        String country3 = "lfbvldsbhvlahLjxzbz";
        double expResult3 = 0.0;
        double result3 = instance.aveInningsPerCountry(players, country3);
        assertEquals(expResult3, result3, 0.0);
    }

    /**
     * Test of aveEconRate method, of class StatUtilities.
     */
    @Test
    public void testAveEconRate_ArrayList() {
        System.out.println("aveEconRate");
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        
        double expResult = 4.63;
        double result = instance.aveEconRate(players);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of aveEconRate method, of class StatUtilities.
     */
    @Test
    public void testAveEconRate_ArrayList_String() {
        System.out.println("aveEconRate");
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        
        String country = "New Zealand";
        double expResult = 4.58;
        double result = instance.aveEconRate(players, country);
        assertEquals(expResult, result, 0.0);
        
        String country2 = "";
        double expResult2 = 0.0;
        double result2 = instance.aveEconRate(players, country2);
        assertEquals(expResult2, result2, 0.0);
        
        String country3 = "ghjkdbgekhfbayefolabgavdsf";
        double expResult3 = 0.0;
        double result3 = instance.aveEconRate(players, country3);
        assertEquals(expResult3, result3, 0.0);
    }

    /**
     * Test of aveBallsBowled method, of class StatUtilities.
     */
    @Test
    public void testAveBallsBowled_ArrayList() {
        System.out.println("aveBallsBowled");
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        
        double expResult = 3113.45;
        double result = instance.aveBallsBowled(players);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of aveBallsBowled method, of class StatUtilities.
     */
    @Test
    public void testAveBallsBowled_ArrayList_String() {
        System.out.println("aveBallsBowled");
        
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        
        String country = "New Zealand";
        double expResult = 3399.66;
        double result = instance.aveBallsBowled(players, country);
        assertEquals(expResult, result, 0.0);
        
        String country2 = "";
        double expResult2 = 0.0;
        double result2 = instance.aveBallsBowled(players, country2);
        assertEquals(expResult2, result2, 0.0);
        
        String country3 = "uregngbsbgylsrgbslbfsluusbsd";
        double expResult3 = 0.0;
        double result3 = instance.aveBallsBowled(players, country3);
        assertEquals(expResult3, result3, 0.0);
    }

    /**
     * Test of aveStrikeRate method, of class StatUtilities.
     */
    @Test
    public void testAveStrikeRate_ArrayList() {
        System.out.println("aveStrikeRate");
        
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        
        double expResult = 43.02;
        double result = instance.aveStrikeRate(players);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of aveStrikeRate method, of class StatUtilities.
     */
    @Test
    public void testAveStrikeRate_ArrayList_String() {
        System.out.println("aveStrikeRate");
        
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        
        String country = "New Zealand";
        double expResult = 43.01;
        double result = instance.aveStrikeRate(players, country);
        assertEquals(expResult, result, 0.0);
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