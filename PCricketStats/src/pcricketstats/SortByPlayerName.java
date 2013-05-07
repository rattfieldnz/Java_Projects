<<<<<<< HEAD
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.Comparator;

/**
 * This is the Comparator class, which is used to sort a list of players 
 * alphabetically by their name.
 * 
 * @author Rob Attfield
 */
public class SortByPlayerName implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the first player's 
     * name is alphabetically greater than, equal to, or 
     * less than that of the second player.
     */
    @Override
    public int compare(Player p1, Player p2) {
        return p1.getPlayerName().compareTo(p2.getPlayerName());
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
 * alphabetically by their name.
 * 
 * @author Rob Attfield
 */
public class SortByPlayerName implements Comparator<Player> {

    /**
     * This is the compare method, which is from
     * the implementation of the Comparator class. 
     * 
     * @param p1 The first player to compare
     * @param p2 The second player to compare
     * @return An integer value, which determines whether the first player's 
     * name is alphabetically greater than, equal to, or 
     * less than that of the second player.
     */
    @Override
    public int compare(Player p1, Player p2) {
        return p1.getPlayerName().compareTo(p2.getPlayerName());
    }
    
}
>>>>>>> 02abca39b84a08ba53ebb9c43f52ef8e3e3eb288
