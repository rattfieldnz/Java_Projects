/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.Comparator;

/**
 * This is the Comparator class, which is used to sort a list of players 
 * by how many innings they have played.
 * 
 * @author Rob Attfield
 */
public class SortByInningsPlayed implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the first player 
     * has played more, the same amount of, or 
     * less innings than that of the second player.
     */
    @Override
    public int compare(Player p1, Player p2) {
        if (p2.getInningsPlayed() != 0 && p1.getInningsPlayed()!= 0) {
            return p2.getInningsPlayed() - p1.getInningsPlayed();
        } else {
            return 0;
        }
    }
    
}
