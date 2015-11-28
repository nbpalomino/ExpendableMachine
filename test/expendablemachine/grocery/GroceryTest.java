/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expendablemachine.grocery;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nbpalomino
 */
public class GroceryTest {
    
    protected Grocery grocery;
    
    public GroceryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.grocery = new Grocery("Soda Test", new Date("25/05/2009"));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isExpired method, of class Grocery.
     */
    @Test
    public void testIsExpired() {
        System.out.println("Grocery test isExpired");
        
        assertTrue(this.grocery.isExpired());        
    }

    /**
     * Test of getName method, of class Grocery.
     */
    @Test
    public void testGetName() {
        System.out.println("Grocery test getName");
        assertEquals("Soda Test", this.grocery.getName());
    }

    /**
     * Test of getExpirationDate method, of class Grocery.
     */
    @Test
    public void testGetExpirationDate() {
        System.out.println("Grocery test getExpirationDate");
        
        assertNotEquals(new Date(), this.grocery.getExpirationDate());
    }
}
