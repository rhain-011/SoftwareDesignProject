/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> deck;
    
    public GroupOfCards()
    {
        int totalCards = 0;
    
        for (int suit = 0; suit < 4; suit++)
        {
            for (int value = 1; value < 14; value++)
            {

            }
        }
    }
    
    
    public ArrayList<Card> showCards()
    {
        return deck;
    }
    
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
}//end class
