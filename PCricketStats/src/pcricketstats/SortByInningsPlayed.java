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
public class SortByInningsPlayed implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        if (p1.getInningsPlayed() != 0 && p2.getInningsPlayed()!= 0) {
            return p1.getInningsPlayed() - p2.getInningsPlayed();
        } else {
            return 0;
        }
    }
    
}
