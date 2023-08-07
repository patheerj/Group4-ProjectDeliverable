/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author KK
 */
public class DashBoard {
    
     private String winner="";
     private String loser="";
    
    DashBoard(String winner, String loser)
    {
        this.winner=winner;
        this.loser=loser;
        
        System.out.println("----------End of War Game---------");
        System.out.println("Congractulations " + winner + " you Won..");
        System.out.println("Bad luck " + loser + " you lose..");
        
        
        
    }
    
     
    
}
