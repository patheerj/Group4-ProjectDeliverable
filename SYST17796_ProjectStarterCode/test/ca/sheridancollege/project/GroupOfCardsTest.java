/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author heer5
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Before class--------------------");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("After class--------------------");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before test--------------------");

    }

    @AfterEach
    public void tearDown() {
        System.out.println("After test--------------------");
    }
    

    /**
     * Test of generateCards method, of class GroupOfCards.
     */
    @Test
    public void testGenerateCards() {
        System.out.println("generateCards");
        GroupOfCards instance = new GroupOfCards();
        int expResult =52;
        int result = instance.generateCards().size();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        LinkedList<Card> list =new LinkedList<Card>();
        list.add(new Card(Card.Suit.HEART,Card.Value.ACE));
        list.add(new Card(Card.Suit.CLUB,Card.Value.TWO));
        list.add(new Card(Card.Suit.DIAMOND,Card.Value.THREE));
        LinkedList<Card> heer=new LinkedList<Card>();
        for(Card c:list){
            heer.add(c);      
        }
        GroupOfCards.shuffle(heer);  
        for(Card c:heer){
            System.out.println(c);      
        }
        boolean expResult=true;
        boolean result=true;
        int abc=0;
        for(int i=0;i<list.size();i++){
            if(heer.get(0).equals(list.get(0)))
                abc++;  
        }
        if(abc==3){
            result=false;
        }
         assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of playing method, of class GroupOfCards.
     */
    @Test
    public void testPlaying() {
        System.out.println("playing");
        LinkedList<Card> list=new LinkedList<Card>();
        list.add(new Card(Card.Suit.HEART,Card.Value.ACE));
        list.add(new Card(Card.Suit.CLUB,Card.Value.TWO));
        list.add(new Card(Card.Suit.DIAMOND,Card.Value.THREE));
        LinkedList<Card> heer=new LinkedList<Card>();
        heer.add(new Card(Card.Suit.HEART,Card.Value.ACE));
        heer.add(new Card(Card.Suit.CLUB,Card.Value.TWO));
        GroupOfCards.playing(list);
        boolean expres=true;
        boolean res=true;
        for(Card c:heer){
            System.out.println(c);      
        }
        for(Card c:list){
            System.out.println(c);      
        }
         for(int i=0;i<list.size();i++){
            if(!(heer.get(0).equals(list.get(0))))
                res=false;
            
        }
         assertEquals(expres,res);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
