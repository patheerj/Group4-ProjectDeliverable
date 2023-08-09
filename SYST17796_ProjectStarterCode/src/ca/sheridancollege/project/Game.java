/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author heer
 */
public class Game {

    private final String name="War Game";//the title of the game   
    public Game() {
    }
    

    
    List<Card> gameDeck=new ArrayList<Card>(30);

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    
    /**
     * Play the game.This might be one method or many method calls depending on your game.
     * @param list
     */
     public void play(List<Card> list) {
        System.out.println(list.get(list.size()-1)+"is being Played");
        list.remove(list.get(list.size()-1));
                
        
        
    }

    

}//end class
