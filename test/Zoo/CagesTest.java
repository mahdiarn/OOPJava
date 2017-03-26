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
 * @author Rizky Faramita <13515055 @ std.stei.itb.ac.id>
 * @version 1.1 (current version number of program)
 * @since 1.1 (the version of the package this class was first added to)
 */
public class CagesTest {
    
    public CagesTest() {
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
     * Test of GetArrayCage method of class Cages.
     */
    @Test
    public void testGetArrayCage() {
        System.out.println("GetArrayCage");
        Cages instance = new Cages();
        Cage[] expResult = null;
        Cage[] result = instance.GetArrayCage();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of GetNeff method of class Cages.
     */
    @Test
    public void testGetNeff() {
        System.out.println("GetNeff");
        //test case untuk ctor tanpa parameter
        Cages instanceNoParam = new Cages();
        int expNeffNoParam = 0;
        int resultNeffNoParam = instanceNoParam.GetNeff();
        assertEquals(expNeffNoParam, resultNeffNoParam);
        //test case untuk ctor dengan parameter
        Cages instanceParam = new Cages(1);
        int expNeffParam = 1;
        int resultNeffParam = instanceParam.GetNeff();
        assertEquals(expNeffParam, resultNeffParam);
        //test case untuk cctor
        Cages instanceCctor = new Cages(2);
        Cages itemCctor = new Cages(instanceCctor);
        int expNeffCctor = instanceCctor.GetNeff();
        int resultNeffCctor = itemCctor.GetNeff();
        assertEquals(expNeffCctor, resultNeffCctor);
    }

    /**
     * Test of SetIdx method of class Cages.
     */
    @Test
    public void testSetIdx() {
        System.out.println("SetIdx");
        Cage _cage = null;
        Cages instance = new Cages();
        instance.SetIdx(_cage);
    }
    
}
