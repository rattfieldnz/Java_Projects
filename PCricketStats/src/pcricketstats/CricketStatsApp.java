/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author attfire1
 */
public class CricketStatsApp {

    /**
     * The main method of the application class.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ArrayList<Player> players = new ArrayList<Player>();
//        
//        ReadInStats worker = new ReadInStats();
//        worker.load(players);
//        
        StatUtilities stats = new StatUtilities();
//        
//        //Collections.sort(players, new SortByPlayerName());
//        //System.out.println(stats.listNPlayers(players,500));
//        
//        System.out.println(stats.aveInningsPerCountry(players, ""));
        
        ArrayList<Player> players = new ArrayList<Player>();
        ReadInStats worker = new ReadInStats();
        worker.load(players);
//        ArrayList<Player> testPlayers = new ArrayList<Player>();
//        int noOfPlayers = 5;
//        
//        for(int i = 0; i < noOfPlayers; i++)
//        {
//            testPlayers.add(players.get(i));
//        }
//
//        StatUtilities instance = new StatUtilities();
//        
//        String expResult = instance.listNPlayers(players, noOfPlayers);
//        String result = instance.listNPlayers(testPlayers, noOfPlayers);
//        
//        System.out.println("*********Expected Result***********");
//        System.out.println(expResult);
//        
//        System.out.println("**********Result**********");
//        System.out.println(result);
        
        System.out.println(stats.listSinglePlayer(players,1));
    }
}
