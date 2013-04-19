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
public class SortByStrikeRate implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        if (p2.getStrikeRate() != 0 && p1.getStrikeRate()!= 0) {
            
            if(p1.getStrikeRate() != p2.getStrikeRate())
            {
                return Double.compare(p1.getStrikeRate(), p2.getStrikeRate());
            }
            else
            {
                return Double.compare(p2.getBowlingAverage(), p1.getBowlingAverage());
            }
        } 
        else 
        {
            return -1;
        }
    }
    
}
