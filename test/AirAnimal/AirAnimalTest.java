/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirAnimal;

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
public class AirAnimalTest {
    
    public AirAnimalTest() {
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
     * Test of Eat method, of class AirAnimal.
     */
    @Test
    public void testEat() {
        System.out.println("Eat");
        AirAnimal instance = new AirAnimal();
        instance.Eat();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Interact method, of class AirAnimal.
     */
    @Test
    public void testInteract() {
        System.out.println("Interact");
        AirAnimal instance = new AirAnimal();
        instance.Interact();
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    /**
     * Testing Default parameter, of class AirAnimal.
     */
    public void testDefault() {
        System.out.println("Test Default Parameter");
        AirAnimal instance;
        instance = new AirAnimal ();
        assertTrue(instance.getWeight() == 0);
        assertTrue(instance.getTipe() == 0);
        assertTrue(instance.getTamed() == false);
        assertTrue(instance.getX() == -1);
        assertTrue(instance.getY() == -1);
    }

    @Test
    /**
     * Testing parameter, of class AirAnimal.
     */
    public void testParameter() {
        System.out.println("Test Parameter");
        AirAnimal instance;
        instance = new AirAnimal(100,1,true,10,5);
        assertTrue(instance.getWeight() == 100);
        assertTrue(instance.getTipe() == 1);
        assertTrue(instance.getTamed() == true);
        assertTrue(instance.getX() == 10);
        assertTrue(instance.getY() == 5);
    }
    
    @Test
    /**
     * Testing setter, of class AirAnimal.
     */
    public void testSetter() {
        AirAnimal instance;
        instance = new AirAnimal();
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
