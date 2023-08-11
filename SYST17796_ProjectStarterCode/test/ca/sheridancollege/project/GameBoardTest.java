/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

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
public class GameBoardTest {
    
    public GameBoardTest() {
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
     * Test of descision method, of class GameBoard.
     */
    @Test
    public void testDescision() {
        System.out.println("descision");
        Card cardlastone = new Card(Card.Suit.DIAMOND,Card.Value.ACE);
        Card cardlasttwo = new Card(Card.Suit.DIAMOND,Card.Value.TWO);
        Game g = new Game();
        GroupOfCards goc=new GroupOfCards();
        Player p1 = new Player(goc.onePlayer);
        Player p2 =  new Player(goc.twoPlayer);
        GameBoard.descision(cardlastone, cardlasttwo, g, p1, p2);
        
        int expResult=26;
        
        int result=p1.PlayerDeck.size();
        
        assertEquals(expResult,result);
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
