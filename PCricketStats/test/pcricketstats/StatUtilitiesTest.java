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
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        int start = 1;
        int end = 5;
        
        String expResult = "Player ID | Player | Country | Career Span | Matches Played | Innings Played | Balls Bowled | Runs Conceded | Wickets Taken | Bowling Average | Economy Rate | Strike Rate | 5 Wickets/Match\n" +
"1 | M Muralitharan | Sri Lanka | Career Span: 18 years | 350 | 341 | 18811 | 12326 | 534 | 23.08 | 3.93 | 35.2 | 10\n" +
"2 | Wasim Akram | Pakistan | Career Span: 19 years | 356 | 351 | 18186 | 11812 | 502 | 23.52 | 3.89 | 36.2 | 6\n" +
"3 | Waqar Younis | Pakistan | Career Span: 14 years | 262 | 258 | 12698 | 9919 | 416 | 23.84 | 4.68 | 30.5 | 13\n" +
"4 | WPUJC Vaas | Sri Lanka | Career Span: 14 years | 322 | 320 | 15775 | 11014 | 400 | 27.53 | 4.18 | 39.4 | 4\n" +
"5 | SM Pollock | South Africa | Career Span: 12 years | 303 | 297 | 15712 | 9631 | 393 | 24.5 | 3.67 | 39.9 | 5\n";
        
        String result = instance.listNPlayers(players, start, end);
        assertEquals(expResult, result);
        
        int start2 = 0;
        int end2 = 4;
        String expResult2 = "Your 'start' value must be greater than or equal to 1.";
        String result2 = instance.listNPlayers(players, start2, end2);
        assertEquals(expResult2, result2);
        
        int start3 = 1;
        int end3 = 888;
        String expResult3 = "Your 'end' value cannot be greater than the size of your 'players' list.";
        String result3 = instance.listNPlayers(players, start3, end3);
        assertEquals(expResult3, result3);
        
        
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
        
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        
        String country = "Afghanistan";
        String expResult = "Player ID | Player | Country | Career Span | Matches Played | Innings Played | Balls Bowled | Runs Conceded | Wickets Taken | Bowling Average | Economy Rate | Strike Rate | 5 Wickets/Match\n" +
"357 | Samiullah Shenwari | Afghanistan | Career Span: 4 years | 25 | 24 | 1143 | 827 | 31 | 26.67 | 4.34 | 36.8 | 0\n" +
"387 | Hamid Hassan | Afghanistan | Career Span: 4 years | 16 | 16 | 788 | 607 | 27 | 22.48 | 4.62 | 29.1 | 0\n" +
"432 | Shapoor Zadran | Afghanistan | Career Span: 3 years | 16 | 16 | 761 | 600 | 22 | 27.27 | 4.73 | 34.5 | 0\n" +
"445 | Mohammad Nabi | Afghanistan | Career Span: 4 years | 25 | 24 | 1140 | 813 | 21 | 38.71 | 4.27 | 54.2 | 0\n";
        
        String result = instance.listPlayersCountry(players, country);
        assertEquals(expResult, result);
        
        String country2 = "Morocco";
        String expResult2 = "There are no players from the country 'Morocco'.";
        String result2 = instance.listPlayersCountry(players, country2);
        assertEquals(expResult2, result2);
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
    }

    /**
     * Test of listSinglePlayer method, of class StatUtilities.
     */
    @Test
    public void testListSinglePlayer() {
        System.out.println("listSinglePlayer");
        
        StatUtilities instance = new StatUtilities();
        ReadInStats worker = new ReadInStats();
        
        ArrayList<Player> players = new ArrayList<Player>();
        worker.load(players);
        
        int playerID = 1;
        String expResult = "Player ID | Player | Country | Career Span | Matches Played | Innings Played | Balls Bowled | Runs Conceded | Wickets Taken | Bowling Average | Economy Rate | Strike Rate | 5 Wickets/Match\n" +
"1 | M Muralitharan | Sri Lanka | Career Span: 18 years | 350 | 341 | 18811 | 12326 | 534 | 23.08 | 3.93 | 35.2 | 10";
        String result = instance.listSinglePlayer(players, playerID);
        assertEquals(expResult, result);
        
        int playerID2 = 0;
        String expResult2 = "'playerID' must be greater than or equal to 1.";
        String result2 = instance.listSinglePlayer(players, playerID2);
        assertEquals(expResult2, result2);
        
        int playerID3 = -1;
        String expResult3 = "'playerID' must be greater than or equal to 1.";
        String result3 = instance.listSinglePlayer(players, playerID3);
        assertEquals(expResult3, result3);
    }
}