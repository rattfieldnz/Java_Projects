package pcricketstats;

import java.util.Comparator;

/**
 * This is the Comparator class, which is used to sort a list of players 
 * by the amount of balls they have bowled.
 * 
 * @author Rob Attfield
 */
public class SortByBallsBowled implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the amount 
     * of balls bowled by the first player is greater than, equal to, or 
     * less than the number bowled by the second player.
     */
    @Override
    public int compare(Player p1, Player p2) {
        
        //If either palyer doesn't have 0 balls bowled
        if(p2.getBallsBowled() != 0 && p1.getBallsBowled() != 0)
        {
            if(p2.getBallsBowled() != p1.getBallsBowled())
            {
                return p2.getBallsBowled() - p1.getBallsBowled();
            }
            else
            {
                //if players have bowled same amount of balls, 
                //sort by amount of runs conceded.
                return p2.getRunsConceded() - p1.getRunsConceded();
            }
        }
        else
        {
            return -1;
        }
    }
    
}
