/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Name=Harry, Date=8/7/2023.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
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

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    //public abstract void play();

}
