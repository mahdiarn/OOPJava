/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elang;

import elang.Elang;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mahdiar Naufal
 */
public class ElangTest {
    
    public ElangTest() {
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
     * Test of Eat method, of class Elang.
     */
    @Test
    public void testEat() {
        System.out.println("Eat");
        Elang instance = new Elang();
        instance.Eat();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Interact method, of class Elang.
     */
    @Test
    public void testInteract() {
        System.out.println("Interact");
        Elang instance = new Elang();
        instance.Interact();
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    /**
     * Testing Default parameter, of class Elang.
     */
    public void testDefault() {
        System.out.println("Test Default Parameter");
        Elang instance;
        instance = new Elang ();
        assertTrue(instance.getWeight() == 0);
        assertTrue(instance.getTipe() == 0);
        assertTrue(instance.getTamed() == false);
        assertTrue(instance.getX() == -1);
        assertTrue(instance.getY() == -1);
    }

    @Test
    /**
     * Testing parameter, of class Elang.
     */
    public void testParameter() {
        System.out.println("Test Parameter");
        Elang instance;
        instance = new Elang(100,1,true,10,5);
        assertTrue(instance.getWeight() == 100);
        assertTrue(instance.getTipe() == 1);
        assertTrue(instance.getTamed() == true);
        assertTrue(instance.getX() == 10);
        assertTrue(instance.getY() == 5);
    }
    
    @Test
    /**
     * Test copy constructor
     *
     */
    public void testCopyConstructor() {
        System.out.println("Test Copy constructor");
        Elang instance1,instance2;
        instance1 = new Elang(100,1,true,10,5);
        instance2 = new Elang(instance1);
        assertTrue(instance2.getWeight() == 100);
        assertTrue(instance2.getTipe() == 1);
        assertTrue(instance2.getTamed() == true);
        assertTrue(instance2.getX() == 10);
        assertTrue(instance2.getY() == 5);
    }
    
    @Test
    /**
     * Testing setter, of class Elang.
     */
    public void testSetter() {
        Elang instance;
        instance = new Elang();
        instance.setWeight(200);
        instance.setTipe(2);
        instance.setTamed(true);
        instance.setX(100);
        instance.setY(1000);
        assertTrue(instance.getWeight() == 200);
        assertTrue(instance.getTipe() == 2);
        assertTrue(instance.getTamed() == true);
        assertTrue(instance.getX() == 100);
        assertTrue(instance.getY() == 1000);
    }
}
