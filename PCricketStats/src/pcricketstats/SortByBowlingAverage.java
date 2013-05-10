/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.Comparator;

/**
 * This is the Comparator class, which is used to sort a list of players 
 * by the players bowling average.
 * 
 * @author Rob Attfield
 */
public class SortByBowlingAverage implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the first player's 
     * bowling average is greater than, equal to, or 
     * less than the bowling average of the second player.
     */
    @Override
    public int compare(Player p1, Player p2) {
        
        if(p2.getBowlingAverage() != 0 && p1.getBowlingAverage() != 0)
        {
            if(p1.getBowlingAverage() != p2.getBowlingAverage())
            {
                //Since the bowling average is a double
                return Double.compare(p1.getBowlingAverage(), p2.getBowlingAverage());
            }
            else
            {
                //if bowling average between players is the same
                return Double.compare(p1.getEconomyRate(), p2.getEconomyRate());
            }
        }
        else
        {
            return -1;
        }
    }
    
}
