/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {
    //The group of cards, stored in an ArrayList
    private LinkedList<Card> card=generateCards();
    
    //the size of the grouping
    private int size =26;
    
    List<Card> onePlayer=card.subList(0, size);
    List<Card> twoPlayer=card.subList(size, (size*2));
    

    public LinkedList<Card> getCard() {
        return card;
    }

    public GroupOfCards() {
        size=26;   
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public LinkedList<Card> generateCards() {
        LinkedList<Card> mydeck;
        mydeck = new LinkedList<Card>();
 
        for(Card.Suit s: Card.Suit.values())
                {
        for(Card.Value v: Card.Value.values())
                    {
                        Card c=new Card(s,v);
                        mydeck.add(c);
                        }
                        
                    }
                
        GroupOfCards.shuffle(mydeck);
        
        return mydeck;

    }

    
    public static void shuffle(LinkedList<Card> heer) {
        Collections.shuffle(heer);
    }
    
    public static LinkedList<Card> playing(LinkedList<Card> list){
        int index=list.size()-1;
        System.out.println(list.get(index));
        list.remove(index); 
        return list;
    }

    
     
}//end class
