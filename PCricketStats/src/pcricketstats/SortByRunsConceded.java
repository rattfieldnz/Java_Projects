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
public class SortByRunsConceded implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        if (p2.getRunsConceded() != 0 && p1.getRunsConceded()!= 0) {
            return p2.getRunsConceded() - p1.getRunsConceded();
        } else {
            return 0;
        }
    }
    
}
