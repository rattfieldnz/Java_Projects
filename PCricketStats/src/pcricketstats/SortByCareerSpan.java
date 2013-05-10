/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.Comparator;

/**
 * This is the Comparator class, which is used to sort a list of players 
 * by the length of a players career (in years).
 * 
 * @author Rob Attfield
 */
public class SortByCareerSpan implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the first player's 
     * career length is greater than, equal to, or 
     * less than the career length of the second player.
     */
    @Override
    public int compare(Player p1, Player p2) {
        
        if(p2.calcCareerSpan() != 0 && p1.calcCareerSpan() != 0)
        {
            //if careerSpan of player2 is not the same as player1
            if(p2.calcCareerSpan() != p1.calcCareerSpan())
            {
                //return the difference of the career spans
                //(p2 - p1 for desc order).
                return p2.calcCareerSpan() - p1.calcCareerSpan();
            }
            else
            {
                //if the player career spans are the same, 
                //sort them by number of matches played.
                return p2.getMatchesPlayed() - p1.getMatchesPlayed();
            }
        }
        else
        {
            return -1;
        }
    }
    
}
