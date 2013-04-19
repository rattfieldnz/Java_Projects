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
public class SortByCountryName implements Comparator<Player>  {

    @Override
    public int compare(Player p1, Player p2) {
        
        if(p1.getCountryName() != null && p2.getCountryName() != null)
        {
            //if the two country names are not equal
            if(p1.getCountryName().compareTo(p2.getCountryName()) != 0)
            {
                return p1.getCountryName().compareTo(p2.getCountryName());
            }
            else
            {
                //Since there will be players from the same country, 
                //this sorts the players by name. The implementation below
                //sorts each player by their last name - using the 
                //the "space" as a delimiter, the substring and indexOf 
                //string methods.
                return p1.getPlayerName().substring(p1.getPlayerName().indexOf(" ")).compareTo(p2.getPlayerName().substring(p2.getPlayerName().indexOf(" ")));
            }
        }
        else
        {
            return -1;
        }
    }
    
}
