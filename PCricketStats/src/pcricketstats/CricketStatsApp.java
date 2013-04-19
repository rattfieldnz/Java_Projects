/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author attfire1
 */
public class CricketStatsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
//        String csvHeader = "Player | Country | Career Span | Matches Played | Innings Played | Balls Bowled | Runs Conceded | "
//                + "Wickets Taken | Bowling Average | Economy Rate | Strike Rate | 5 Wickets/Match";
        
        ReadInStats worker = new ReadInStats();
        worker.load(players);
        
        StatUtilities stats = new StatUtilities();
        
        stats.outputSort(players, 0);
        
    }
}
