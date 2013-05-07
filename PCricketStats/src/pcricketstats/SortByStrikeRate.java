<<<<<<< HEAD
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.Comparator;

/**
 * This is the Comparator class, which is used to sort a list of players 
 * by their bowling strike rate.
 * 
 * @author Rob Attfield
 */
public class SortByStrikeRate implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the first player
     * has a larger, the same, or 
     * smaller strike-rate than that of the second player.
     */
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
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.Comparator;

/**
 * This is the Comparator class, which is used to sort a list of players 
 * by their bowling strike rate.
 * 
 * @author Rob Attfield
 */
public class SortByStrikeRate implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the first player
     * has a larger, the same, or 
     * smaller strike-rate than that of the second player.
     */
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
>>>>>>> 02abca39b84a08ba53ebb9c43f52ef8e3e3eb288
