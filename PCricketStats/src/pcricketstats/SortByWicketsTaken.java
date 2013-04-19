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
public class SortByWicketsTaken implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        if (p2.getWicketsTaken() != 0 && p1.getWicketsTaken()!= 0) {
            
            if(p2.getWicketsTaken() != p1.getWicketsTaken())
            {
                return p2.getWicketsTaken() - p1.getWicketsTaken();
            }
            else
            {
                return Double.compare(p1.getEconomyRate(), p2.getEconomyRate());
            }
        } 
        else 
        {
            return 0;
        }
    }
    
}