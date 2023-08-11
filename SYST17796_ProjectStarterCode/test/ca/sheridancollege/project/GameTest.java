/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
public class GameTest {
    public GameTest(){}
    
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
     * Test of play method, of class Game.
     */
    @Test
    public void testPlayBad() {
        System.out.println("Bad case");
        List<Card> list = new ArrayList<>(10);
        Game instance = new Game();
        try {
            instance.play(list);
        }catch(IndexOutOfBoundsException ex){
            System.out.println(ex);
        }


        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPlayBoundary() {
        System.out.println("Boundary Case");
        List<Card> list = new ArrayList<>(10);
        Game instance = new Game();
        list.add(new Card(Card.Suit.DIAMOND,Card.Value.ACE));
        instance.play(list);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testPlayGood() {
        System.out.println("Good Case");
        List<Card> list = new ArrayList<>(10);
        list.add(new Card(Card.Suit.DIAMOND,Card.Value.ACE));
        list.add(new Card(Card.Suit.DIAMOND,Card.Value.ACE));
        list.add(new Card(Card.Suit.DIAMOND,Card.Value.ACE));
        Game instance = new Game();
        instance.play(list);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
