/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class ZooTest {
    
    public ZooTest() {
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
     * Test of GetElementZoo method of class Zoo.
     */
    @Test
    public void testGetElementZoo() {
        System.out.println("GetElementZoo");
        int x = 0;
        int y = 0;
        Zoo instance = new Zoo();
        int expResult = 0;
        int result = instance.GetElementZoo(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PrintZoo method of class Zoo.
     */
    @Test
    public void testPrintZoo() {
        System.out.println("PrintZoo");
        int nbrs = 0;
        int nkol = 0;
        Zoo instance = new Zoo();
        instance.PrintZoo(nbrs, nkol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetElementZoo method of class Zoo.
     */
    @Test
    public void testSetElementZoo() {
        System.out.println("SetElementZoo");
        int x = 0;
        int y = 0;
        int k = 0;
        Zoo instance = new Zoo();
        instance.SetElementZoo(x, y, k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
