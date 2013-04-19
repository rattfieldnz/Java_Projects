/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.Comparator;

/**
 *
 * @author attfire1
 */
public class SortByFiveWicketsInn implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        
        if(p2.getFiveWicketsInnings() != p1.getFiveWicketsInnings())
        {
            return p2.getFiveWicketsInnings() - p1.getFiveWicketsInnings();
        }
        else
        {
            return p2.getWicketsTaken() - p1.getWicketsTaken();
        }
        
    }
    
}
