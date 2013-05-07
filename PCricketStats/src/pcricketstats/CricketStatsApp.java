<<<<<<< HEAD
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
        
        //stats.outputSort(players, 0);
        
        //Collections.sort(players, new SortByPlayerName());
        stats.listNPlayers(players, 6, 9);
        
    }
}
=======
<<<<<<< HEAD
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
        
        //stats.outputSort(players, 0);
        
        //Collections.sort(players, new SortByPlayerName());
        stats.listNPlayers(players, 6, 9);
        
    }
}
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.ArrayList;

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
        
        stats.outputSort(players, 0);
        
    }
}
>>>>>>> 02abca39b84a08ba53ebb9c43f52ef8e3e3eb288
>>>>>>> 9a20aeefd2aaee4cd21fa306ecacefee31b94460
