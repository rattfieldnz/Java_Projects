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
public class SortByBowlingAverage implements Comparator<Player> {

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
