/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Harry
 */
public class DashBoard {
    
     private String winner="";
     private String loser="";
    
    DashBoard(String winner, String loser)
    {
        this.winner=winner;
        this.loser=loser;
        printScoreboard();       
             
    }
    //applied open close principle-can add more without changing the main code
    private void printScoreboard(){
        System.out.println("----------End of War Game---------");
        System.out.println("Congratulations " + winner + " you Won..");
        System.out.println("Bad luck " + loser + " you lose..");
        System.out.println("-----------------------------------");
    }
    
     
    
}
