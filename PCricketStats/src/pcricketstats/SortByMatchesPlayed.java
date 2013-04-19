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
public class SortByMatchesPlayed implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        if (p2.getMatchesPlayed() != 0 && p1.getMatchesPlayed()!= 0) {
            return p2.getMatchesPlayed() - p1.getMatchesPlayed();
        } else {
            return p2.getInningsPlayed() - p1.getInningsPlayed();
        }
    }
    
}
