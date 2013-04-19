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
public class SortByPlayerName implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        return p1.getPlayerName().compareTo(p2.getPlayerName());
    }
    
}
