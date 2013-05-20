/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.Comparator;

/**
 * This is the Comparator class, which is used to sort a list of players 
 * by how many innings they got 5 wickets in.
 * 
 * @author Rob Attfield
 */
public class SortByFiveWicketsInn implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the first player's 
     * amount of 5 wicket innings is more, the same as, or 
     * less than that of the second player.
     */
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
