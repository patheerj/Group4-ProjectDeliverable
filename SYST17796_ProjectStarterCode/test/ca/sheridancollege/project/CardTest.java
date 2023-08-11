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
     * Test of equalValue method, of class Card.
     */
    @Test
    public void testEqualValueBad() {
        System.out.println("Bad Case");
        Card card = new Card(Card.Suit.DIAMOND,Card.Value.TWO);
        Card instance = new Card(Card.Suit.HEART,Card.Value.ACE);
        boolean expResult = false;
        boolean result = instance.equalValue(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEqualValueBorder() {
        System.out.println("Border Case");
        Card card = new Card(Card.Suit.DIAMOND,Card.Value.ACE);
        Card instance = new Card(Card.Suit.HEART,Card.Value.ACE);
        boolean expResult = true;
        boolean result = instance.equalValue(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEqualValueGood() {
        System.out.println(" Good case ");
        Card card = new Card(Card.Suit.HEART,Card.Value.ACE);
        Card instance = new Card(Card.Suit.HEART,Card.Value.ACE);
        boolean expResult = true;
        boolean result = instance.equalValue(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of greaterThan method, of class Card.
     */
    @Test
    public void testGreaterThanBad() {
        System.out.println("Bad Case");
        Card card = new Card(Card.Suit.DIAMOND,Card.Value.ACE);
        Card instance = new Card(Card.Suit.HEART,Card.Value.TWO);
        boolean expResult = false;
        boolean result = instance.greaterThan(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test
    public void testGreaterThanBorder() {
        System.out.println("Border Case");
        Card card = new Card(Card.Suit.DIAMOND,Card.Value.TWO);
        Card instance = new Card(Card.Suit.HEART,Card.Value.TWO);
        boolean expResult = false;
        boolean result = instance.greaterThan(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test
    public void testGreaterThanGood() {
        System.out.println(" Good case ");
        Card card = new Card(Card.Suit.DIAMOND,Card.Value.TWO);
        Card instance = new Card(Card.Suit.HEART,Card.Value.ACE);
        boolean expResult = true;
        boolean result = instance.greaterThan(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    
}
