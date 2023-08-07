/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 *Name =Harry, Date=8/7/2023.
 */
package ca.sheridancollege.project;



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
     * 
     */
 
    public enum Value{TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};
    public enum Suit{DIAMOND,SPADE,HEART,CLOVE};
    private Value value;
    private Suit suit;

    public Card(Suit s, Value v) {
        value=v;
        suit=s;
    }

    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }
   
    @Override
    public String toString(){
       
      return (":::"+value+" of "+suit+":::");
    }
    
    public boolean equals(Card card){
        return(this.suit.equals(card.suit)&&this.value.equals(card.value));
    }
    
    //used to declare war
    public boolean equalValue(Card card){
        return(this.value.equals(card.value));
    }
    
    public boolean greaterThan(Card c){
        Value v=c.value;
        Value vv=this.value;
        for(int i=0;i<13;i++){
            if(v==Value.values()[i]){
                
                for(int y=i+1;y<13;y++){
                    if(vv==Value.values()[y])
                        return true;
                    
                    
                        
                    
                }
                
            }
            
        }  
        return false;
        
        
        
    }
}
