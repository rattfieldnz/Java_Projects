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
        System.out.println(stats.listPlayersCountry(players,"Morocco"));
        
        ArrayList<Player> testPlayers = new ArrayList<Player>();
        for(int i = 0; i < 10; i++)
        {
            testPlayers.add(players.get(i));
        }
        
        System.out.println(stats.outputSort(testPlayers, 11));
//        String name = "Bob Robertson";
//        
//        String p1_lastName = name.substring(name.indexOf(' ')+1, name.length());
//        
//        System.out.println(p1_lastName);
    }
}
