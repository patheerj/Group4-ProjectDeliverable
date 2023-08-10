/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author heer5
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    /**
     * Test of equalValue method, of class Card.
     */
    @Test
    public void testEqualValueGood() {
        System.out.println("equalValue");
        Card card = new Card(Card.Suit.CLUB,Card.Value.ACE);
        Card instance = new Card(Card.Suit.CLUB,Card.Value.ACE);
        boolean expResult = true;
        boolean result = instance.equalValue(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEqualValueBoundary() {
        System.out.println("equalValue");
        Card card = new Card(Card.Suit.CLUB,Card.Value.ACE);
        Card instance = new Card(Card.Suit.SPADE,Card.Value.ACE);
        boolean expResult = true;
        boolean result = instance.equalValue(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEqualValueBad() {
        System.out.println("equalValue");
        Card card = new Card(Card.Suit.CLUB,Card.Value.ACE);
        Card instance = new Card(Card.Suit.SPADE,Card.Value.TWO);
        boolean expResult = false;
        boolean result = instance.equalValue(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //("The test case is a prototype.");
    }

    /**
     * Test of greaterThan method, of class Card.
     */
   // @Test
//    public void testGreaterThan() {
//        System.out.println("greaterThan");
//        Card c = null;
//        Card instance = null;
//        boolean expResult = false;
//        boolean result = instance.greaterThan(c);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
