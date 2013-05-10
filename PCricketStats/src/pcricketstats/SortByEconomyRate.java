<<<<<<< HEAD
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.Comparator;

/**
 * This is the Comparator class, which is used to sort a list of players 
 * by their bowling economy rate.
 * 
 * @author Rob Attfield
 */
public class SortByEconomyRate implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the first player's 
     * bowling economy rate is greater than, equal to, or 
     * less than the country name of the second player.
     */
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
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.Comparator;

/**
 * This is the Comparator class, which is used to sort a list of players 
 * by their bowling economy rate.
 * 
 * @author Rob Attfield
 */
public class SortByEconomyRate implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the first player's 
     * bowling economy rate is greater than, equal to, or 
     * less than the country name of the second player.
     */
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
>>>>>>> 474a59d2f7257c345bf9f56773645bc9d2d4f960
