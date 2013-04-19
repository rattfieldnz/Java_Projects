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
public class SortByEconomyRate implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        
        if(p1.getEconomyRate() != 0 && p2.getEconomyRate() != 0)
        {
            if(p1.getEconomyRate() != p2.getEconomyRate())
            {
                return Double.compare(p1.getEconomyRate(), p2.getEconomyRate());
            }
            else
            {
                //if bowling economy rate between players is the same, 
                //sort by their career strike rate.
                return Double.compare(p1.getStrikeRate(), p2.getStrikeRate());
            }
        }
        else
        {
            return -1;
        }
    }
    
}
