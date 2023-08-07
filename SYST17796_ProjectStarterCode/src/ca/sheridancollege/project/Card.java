/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
 
    public enum Value{ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING};
    public enum Suit{DIAMOND,SPADE,HEART,CLOVE};
    private static Value value;
    private static Suit suit;

    public Card(Suit s, Value v) {
        value=v;
        suit=s;
    }

    public static Value getValue() {
        return value;
    }

    public static Suit getSuit() {
        return suit;
    }
   
    @Override
    public String toString(){
       
      return (value+" of "+suit);
    }

}
