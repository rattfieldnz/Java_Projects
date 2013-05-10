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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of setPlayerName method, of class Player.
     */
    @Test
    public void testSetPlayerName() {
        System.out.println("setPlayerName");
        String playerName = "M Muralitharan";
        Player instance = new Player(1, "Chaminda Vaas", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        instance.setPlayerName(playerName);
        
        String result = instance.getPlayerName();
        
        assertEquals(playerName, result);
    }

    /**
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        String expResult = "M Muralitharan";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCountryName method, of class Player.
     */
    @Test
    public void testSetCountryName() {
        System.out.println("setCountryName");
        String countryName = "Sri Lanka";
        Player instance = new Player(1, "M Muralitharan", "Equatorial Guinea", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        instance.setCountryName(countryName);
        String result = instance.getCountryName();
        
        assertEquals(countryName, result);
    }

    /**
     * Test of getCountryName method, of class Player.
     */
    @Test
    public void testGetCountryName() {
        System.out.println("getCountryName");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        String expResult = "Sri Lanka";
        String result = instance.getCountryName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCareerSpan method, of class Player.
     */
    @Test
    public void testSetCareerSpan() {
        System.out.println("setCareerSpan");
        String careerSpan = "1993-2011";
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "2013-2013", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        instance.setCareerSpan(careerSpan);
        
        String result = instance.getCareerSpan();
        
        assertEquals(careerSpan, result);
    }

    /**
     * Test of getCareerSpan method, of class Player.
     */
    @Test
    public void testGetCareerSpan() {
        System.out.println("getCareerSpan");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        String expResult = "1993-2011";
        String result = instance.getCareerSpan();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMatchesPlayed method, of class Player.
     */
    @Test
    public void testSetMatchesPlayed() {
        System.out.println("setMatchesPlayed");
        int matchesPlayed = 350;
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 0, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        instance.setMatchesPlayed(matchesPlayed);
        
        int result = instance.getMatchesPlayed();
        
        assertEquals(matchesPlayed, result);
    }

    /**
     * Test of getMatchesPlayed method, of class Player.
     */
    @Test
    public void testGetMatchesPlayed() {
        System.out.println("getMatchesPlayed");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        int expResult = 350;
        int result = instance.getMatchesPlayed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInningsPlayed method, of class Player.
     */
    @Test
    public void testSetInningsPlayed() {
        System.out.println("setInningsPlayed");
        int inningsPlayed = 341;
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 0, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        instance.setInningsPlayed(inningsPlayed);
        
        int result = instance.getInningsPlayed();
        
        assertEquals(inningsPlayed, result);
    }

    /**
     * Test of getInningsPlayed method, of class Player.
     */
    @Test
    public void testGetInningsPlayed() {
        System.out.println("getInningsPlayed");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        int expResult = 341;
        int result = instance.getInningsPlayed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBallsBowled method, of class Player.
     */
    @Test
    public void testSetBallsBowled() {
        System.out.println("setBallsBowled");
        int ballsBowled = 18811;
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 0, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        instance.setBallsBowled(ballsBowled);
        
        int result = instance.getBallsBowled();
        
        assertEquals(ballsBowled, result);
    }

    /**
     * Test of getBallsBowled method, of class Player.
     */
    @Test
    public void testGetBallsBowled() {
        System.out.println("getBallsBowled");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        int expResult = 18811;
        int result = instance.getBallsBowled();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRunsConceded method, of class Player.
     */
    @Test
    public void testSetRunsConceded() {
        System.out.println("setRunsConceded");
        int runsConceded = 12326;
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 0, 534, 23.08, 3.93, 35.2, 10);
        
        instance.setRunsConceded(runsConceded);
        
        int result = instance.getRunsConceded();
        
        assertEquals(runsConceded, result);
    }

    /**
     * Test of getRunsConceded method, of class Player.
     */
    @Test
    public void testGetRunsConceded() {
        System.out.println("getRunsConceded");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        int expResult = 12326;
        int result = instance.getRunsConceded();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWicketsTaken method, of class Player.
     */
    @Test
    public void testSetWicketsTaken() {
        System.out.println("setWicketsTaken");
        int wicketsTaken = 534;
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 0, 23.08, 3.93, 35.2, 10);
        
        instance.setWicketsTaken(wicketsTaken);
        
        int result = instance.getWicketsTaken();
        
        assertEquals(wicketsTaken, result);
    }

    /**
     * Test of getWicketsTaken method, of class Player.
     */
    @Test
    public void testGetWicketsTaken() {
        System.out.println("getWicketsTaken");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        int expResult = 534;
        int result = instance.getWicketsTaken();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBowlingAverage method, of class Player.
     */
    @Test
    public void testSetBowlingAverage() {
        System.out.println("setBowlingAverage");
        double bowlingAverage = 23.08;
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 0.0, 3.93, 35.2, 10);
        
        instance.setBowlingAverage(bowlingAverage);
        
        double result = instance.getBowlingAverage();
        
        assertEquals(bowlingAverage, result, 0.0);
    }

    /**
     * Test of getBowlingAverage method, of class Player.
     */
    @Test
    public void testGetBowlingAverage() {
        System.out.println("getBowlingAverage");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        double expResult = 23.08;
        double result = instance.getBowlingAverage();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setEconomyRate method, of class Player.
     */
    @Test
    public void testSetEconomyRate() {
        System.out.println("setEconomyRate");
        double economyRate = 0.0;
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        instance.setEconomyRate(economyRate);
        
        double result = instance.getEconomyRate();
        
        assertEquals(economyRate, result, 0.0);
    }

    /**
     * Test of getEconomyRate method, of class Player.
     */
    @Test
    public void testGetEconomyRate() {
        System.out.println("getEconomyRate");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        double expResult = 3.93;
        double result = instance.getEconomyRate();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setStrikeRate method, of class Player.
     */
    @Test
    public void testSetStrikeRate() {
        System.out.println("setStrikeRate");
        double strikeRate = 35.2;
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 0.0, 10);
        
        instance.setStrikeRate(strikeRate);
        
        double result = instance.getStrikeRate();
        
        assertEquals(strikeRate, result, 0.0);
    }

    /**
     * Test of getStrikeRate method, of class Player.
     */
    @Test
    public void testGetStrikeRate() {
        System.out.println("getStrikeRate");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        double expResult = 35.2;
        double result = instance.getStrikeRate();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setFiveWicketsInnings method, of class Player.
     */
    @Test
    public void testSetFiveWicketsInnings() {
        System.out.println("setFiveWicketsInnings");
        int fiveWicketsInnings = 10;
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 0);
        
        instance.setFiveWicketsInnings(fiveWicketsInnings);
        
        int result = instance.getFiveWicketsInnings();
        
        assertEquals(fiveWicketsInnings, result);
    }

    /**
     * Test of getFiveWicketsInnings method, of class Player.
     */
    @Test
    public void testGetFiveWicketsInnings() {
        System.out.println("getFiveWicketsInnings");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        int expResult = 10;
        int result = instance.getFiveWicketsInnings();
        assertEquals(expResult, result);
    }

    /**
     * Test of calcCareerSpan method, of class Player.
     */
    @Test
    public void testCalcCareerSpan() {
        System.out.println("calcCareerSpan");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        int expResult = 18;
        int result = instance.calcCareerSpan();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString - single player");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        String expResult = "1 | M Muralitharan | Sri Lanka | Career Span: 18 years | 350 | 341 | 18811 | 12326 | 534 | 23.08 | 3.93 | 35.2 | 10";
        String result = instance.toString();
        
        assertEquals(expResult, result);
    }
    
//    @Test
//    public void testToString_multiplePlayers() {
//        System.out.println("toString - multiple players");
//        Player p1 = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
//        Player p2 = new Player(2, "Wasim Akram", "Pakistan", "1984-2003", 356, 351, 18186, 11812, 502, 23.52, 3.89, 36.2, 6);
//
//        ArrayList<Player> players = new ArrayList<Player>();
//        players.add(p1);
//        players.add(p2);
//        
//        String expResult = "1 | M Muralitharan | Sri Lanka | Career Span: 18 years | 350 | 341 | 18811 | 12326 | 534 | 23.08 | 3.93 | 35.2 | 10\n" + 
//                           "2 | Wasim Akram | Pakistan | Career Span: 19 years | 356 | 351 | 18186 | 11812 | 502 | 23.52 | 3.89 | 36.2 | 6";
//        
//        String result = players.toString();
//        
//        assertEquals(expResult, result);
//    }

    /**
     * Test of setPlayerID method, of class Player.
     */
    @Test
    public void testSetPlayerID() {
        System.out.println("setPlayerID");
        int playerID = 1;
        Player instance = new Player(0, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        instance.setPlayerID(playerID);
        
        int result = instance.getPlayerID();
        
        assertEquals(playerID, result);
    }

    /**
     * Test of getPlayerID method, of class Player.
     */
    @Test
    public void testGetPlayerID() {
        System.out.println("getPlayerID");
        Player instance = new Player(1, "M Muralitharan", "Sri Lanka", "1993-2011", 350, 341, 18811, 12326, 534, 23.08, 3.93, 35.2, 10);
        
        int expResult = 1;
        int result = instance.getPlayerID();
        assertEquals(expResult, result);
    }
}