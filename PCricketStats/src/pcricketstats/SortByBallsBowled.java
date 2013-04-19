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
public class SortByBallsBowled implements Comparator<Player> {

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
