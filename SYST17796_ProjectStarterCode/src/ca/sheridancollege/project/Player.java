/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author heer
 */
public class Player {

    private String name; //the unique name for this player
    
    
    List<Card> PlayerDeck=new ArrayList<Card>(52);
    

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * 
     * @param Pd
     */
    public Player(List<Card> Pd) {
       for(int i=0;i<Pd.size();i++){
           PlayerDeck.add(Pd.get(i));
       }
    }
    
 

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    

}
