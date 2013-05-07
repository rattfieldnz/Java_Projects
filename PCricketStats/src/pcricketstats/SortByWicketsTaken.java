<<<<<<< HEAD
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.Comparator;

/**
 * This is the Comparator class, which is used to sort a list of players 
 * by how many wickets they have taken.
 * 
 * @author Rob Attfield
 */
public class SortByWicketsTaken implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the first player
     * has taken more, the same, or smaller amount of wickets than that 
     * of the second player.
     */
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
    
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.Comparator;

/**
 * This is the Comparator class, which is used to sort a list of players 
 * by how many wickets they have taken.
 * 
 * @author Rob Attfield
 */
public class SortByWicketsTaken implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the first player
     * has taken more, the same, or smaller amount of wickets than that 
     * of the second player.
     */
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
    
>>>>>>> 02abca39b84a08ba53ebb9c43f52ef8e3e3eb288
}