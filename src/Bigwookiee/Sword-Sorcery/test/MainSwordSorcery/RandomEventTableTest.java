/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MainSwordSorcery;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class RandomEventTableTest {
    private RandomEventTable rEvent;
   
    
    public RandomEventTableTest() {
          rEvent = new RandomEventTable(0);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of EventKey method, of class RandomEventTable.
     */
    @Test
    public void testRandEvent() {
        System.out.println("EventKey");
        int result = rEvent.EventKey();
        System.out.println(result + "\n");
        
        System.out.println("EventLength");
        result = rEvent.EventLength();
        System.out.println(result + "\n");
        
        System.out.println("Event Description");
        String result1 = rEvent.EventDescription();
        System.out.println(result1 + "\n");
        
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
    
}
