/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * 
 * modified by: Rhainel 23-03-21
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public class Card 
{
    final private int value;
    final private int suit;
    
    
    final private String[] values = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    
    final private String[]  suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
    
    
    public Card(int value, int suit)
    {
        this.value = value;
        this.suit = suit;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public int getSuit()
    {
        return suit;
    }
    
    @Override
    public String toString()
    {
        return values[value] + "of " + suits[suit];
    }
    
}

// Sami Editted this 
// Tony was here.
