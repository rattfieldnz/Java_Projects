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
public class SortByCareerSpan implements Comparator<Player> {

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
