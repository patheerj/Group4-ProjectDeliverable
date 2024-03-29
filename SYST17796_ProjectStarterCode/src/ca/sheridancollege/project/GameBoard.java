/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;


import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Heer
 */
public class GameBoard {
    public static void main(String[] args){
        
        
    
    GroupOfCards goc=new GroupOfCards();
    
    Game g=new Game();
    Player p1=new Player(goc.onePlayer);
    Player p2=new Player(goc.twoPlayer);
    String type = askingGame();
    String ans = askingName(type, p1,p2);
    GameBoard.playing(g,p1,p2);
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////
    public static  void playing(Game g, Player p1, Player p2){
        System.out.println("<<<<Deck has been dealed>>>>");
        System.out.println("Press P to draw a card");      
        Scanner scan=new Scanner(System.in);       
        do{
            System.out.println("-----"+ p1.getName()+" turn -----");
             int p1Cards=p1.PlayerDeck.size();
            System.out.println("cards left: "+p1Cards);
            
            if (p1Cards==0)
            {   DashBoard dashboard = new DashBoard( p2.getName(),p1.getName());
              break;
            }
            String input;
            Card cardPlayedOne=p1.PlayerDeck.get(p1.PlayerDeck.size()-1);
            
            
            
            do{
                System.out.print("Play :");
                input=scan.nextLine();
                
                
              }while(!input.equals("P"));
            
                if(!p1.PlayerDeck.isEmpty()&&(input.equals("P"))){
                    
                    g.gameDeck.add(cardPlayedOne);
                    g.play(p1.PlayerDeck);
                   
                }
            System.out.println("-----"+ p2.getName()+" turn -----");
            int p2Cards =p2.PlayerDeck.size();
            System.out.println("cards left: "+p2Cards );
            
             if (p2Cards==0)
            {  
                DashBoard dashboard1 = new DashBoard( p1.getName(),p2.getName());
              break;
            }
             
            String inputX;
            Card cardPlayedTwo = p2.PlayerDeck.get(p2.PlayerDeck.size()-1);
            
            if(p2.getName().equals("Computer")){
            
                if(!p2.PlayerDeck.isEmpty()){
    
                    g.gameDeck.add(cardPlayedTwo);
                    g.play(p2.PlayerDeck);
           
            }
                
            }else{
            do{
                System.out.print("Play :");
                inputX=scan.nextLine();
                
                
              }while(!inputX.equals("P"));
              
                if(!p2.PlayerDeck.isEmpty()&&(inputX.equals("P"))){
    
                    g.gameDeck.add(cardPlayedTwo);
                    g.play(p2.PlayerDeck);
           
            }
                
            }

            
            if(cardPlayedOne.equalValue(cardPlayedTwo)){
                //war code for playing
                System.out.println("War is declared");
                System.out.print("-----"+p1.getName()+"-----");
                    play(p1,g);
                    play(p1,g);
                    play(p1,g);
                    play(p1,g);
                    
                    Card cardlastone =g.gameDeck.get(g.gameDeck.size()-1);
                System.out.print("-----"+p2.getName()+"-----");
                
                    play(p2,g);
                    play(p2,g);
                    play(p2,g);
                    play(p2,g);
                
                    Card cardlasttwo =g.gameDeck.get(g.gameDeck.size()-1); 
                  
                  //game descision statements
                
                  descision(cardlastone, cardlasttwo, g,p1,p2);
                
 
            
            }else if(cardPlayedOne.greaterThan(cardPlayedTwo)){
                for(Card c:g.gameDeck){
                    p1.PlayerDeck.add(c);
                    
                }
                System.out.println(p1.getName()+" Wins");
                Collections.shuffle(p1.PlayerDeck);
                g.gameDeck.clear();
            }else{
                for(Card c:g.gameDeck){
                    p2.PlayerDeck.add(c);
                }
                System.out.println(p2.getName()+" Wins");
                Collections.shuffle(p2.PlayerDeck);
                g.gameDeck.clear();
            }
                  
            }while(!p1.PlayerDeck.isEmpty()||!p2.PlayerDeck.isEmpty());
        
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static String askingGame(){
        Scanner scan=new Scanner(System.in);
        String type;
        do{
        System.out.println("Enter M for Multiplayer Game and C for Game Against Computer: ");
        type=scan.nextLine();
        }while(!(type.equals("M"))&&!(type.equals("C")));
        return type;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static String askingName(String type, Player p1,Player p2){
        Scanner scan=new Scanner(System.in);
        String ans;
        do{
        System.out.print("Do you want to select name for Players: Y or N");
        ans=scan.nextLine();
        }while(!(ans.equals("Y"))&&!(ans.equals("N")));

        String playerOne;
        String playerTwo;
                
        switch(ans){

            case "Y":{
                    switch(type){
                        case "M":{
                            System.out.println("Enter the first player name: ");
                            playerOne=scan.nextLine();
                            p1.setName(playerOne);
                            System.out.println("Enter the Second player name: ");
                            playerTwo=scan.nextLine();
                            p2.setName(playerTwo);
                        };
                            break;
                        case "C":{
                            System.out.println("Enter the first player name: ");
                            playerOne=scan.nextLine();
                            p1.setName(playerOne);
                            p2.setName("Computer");
                        };
                            break;
                        default:;
                    }
            };
                break;
            case "N":{
                    switch(type){
                        case "M":{
                            p1.setName("Player1");
                            p2.setName("Player2");
                        };
                            break;
                        case "C":{
                            p1.setName("Player1");
                            p2.setName("Computer");
                        };
                            break;
                        default:;
                    }

            };
                break;
            default:;

    }
        return ans;
    
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////
    public static void play(Player p, Game g){
         if(!p.PlayerDeck.isEmpty()){
    
                    g.gameDeck.add(p.PlayerDeck.get(p.PlayerDeck.size()-1));
                    g.play(p.PlayerDeck);
                    
                    }
        
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void descision(Card cardlastone, Card cardlasttwo, Game g, Player p1, Player p2){
        if((cardlastone).greaterThan(cardlasttwo)){
                    
                    for(Card c:g.gameDeck){
                    p1.PlayerDeck.add(c);
                    
                    }
                    System.out.println(p1.getName()+" Wins");
                    Collections.shuffle(p1.PlayerDeck);
                    g.gameDeck.clear();
                }else{
                
                    for(Card c:g.gameDeck){
                    p2.PlayerDeck.add(c);
                    }
                    System.out.println(p2.getName()+" Wins");
                    Collections.shuffle(p2.PlayerDeck);
                    g.gameDeck.clear();
                
                }
    
    }
    
   


}
