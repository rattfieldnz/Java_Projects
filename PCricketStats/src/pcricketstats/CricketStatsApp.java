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
        ArrayList<Player> players = new ArrayList<Player>();
        
        ReadInStats worker = new ReadInStats();
        worker.load(players);
        
        StatUtilities stats = new StatUtilities();
        
        //Collections.sort(players, new SortByPlayerName());
        //System.out.println(stats.listNPlayers(players,500));
        
<<<<<<< HEAD
        System.out.println(stats.outputSort(players, 0));
=======
        System.out.println(stats.outputSort(players, 11));
>>>>>>> 56b853348899356f49e129f6dc8bdcae0682f7b9
        
    }
}
