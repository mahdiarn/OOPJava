/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

import Kucing.Kucing;
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
public class CageTest {
    
    public CageTest() {
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
     * Test of GetX method, of class Cage.
     */
    @Test
    public void testGetX() {
        System.out.println("GetX");
        //test case untuk ctor tanpa parameter
        Cage instanceNoParam = new Cage();
        int expResultNoParam = 0;
        int resultNoParam = instanceNoParam.GetX();
        assertEquals(expResultNoParam, resultNoParam);
        //test case untuk ctor dengan parameter
        Cage instanceParam = new Cage(1,1,1,1);
        int expResultParam = 1;
        int resultParam = instanceParam.GetX();
        assertEquals(expResultParam, resultParam);
        //testcase untuk cctor
        Cage instanceCctor = new Cage(2,2,2,2);
        Cage itemCctor = new Cage(instanceCctor);
        int expResultCctor = itemCctor.GetX();
        int resultCctor = instanceCctor.GetX();
        assertEquals(expResultCctor, resultCctor);        
    }

    /**
     * Test of GetY method of class Cage.
     */
    @Test
    public void testGetY() {
        System.out.println("GetY");
        //test case untuk ctor tanpa parameter
        Cage instanceNoParam = new Cage();
        int expResultNoParam = 0;
        int resultNoParam = instanceNoParam.GetY();
        assertEquals(expResultNoParam, resultNoParam);
        //test case untuk ctor dengan parameter
        Cage instanceParam = new Cage(1,1,1,1);
        int expResultParam = 1;
        int resultParam = instanceParam.GetY();
        assertEquals(expResultParam, resultParam);
        //testcase untuk cctor
        Cage instanceCctor = new Cage(2,2,2,2);
        Cage itemCctor = new Cage(instanceCctor);
        int expResultCctor = itemCctor.GetY();
        int resultCctor = instanceCctor.GetY();
        assertEquals(expResultCctor, resultCctor); 
    }

    /**
     * Test of GetAnimal method, of class Cage.
     */
    @Test
    public void testGetAnimal() {
        System.out.println("GetAnimal");
        //test case untuk ctor tanpa parameter
        Cage instanceNoParam = new Cage();
        int expResultNoParam = 0;
        int resultNoParam = instanceNoParam.GetAnimal();
        assertEquals(expResultNoParam, resultNoParam);
        //test case untuk ctor dengan parameter
        Cage instanceParam = new Cage(1,1,1,1);
        int expResultParam = 1;
        int resultParam = instanceParam.GetAnimal();
        assertEquals(expResultParam, resultParam);
        //testcase untuk cctor
        Cage instanceCctor = new Cage(2,2,2,2);
        Cage itemCctor = new Cage(instanceCctor);
        int expResultCctor = instanceCctor.GetAnimal();
        int resultCctor = itemCctor.GetAnimal();
        assertEquals(expResultCctor, resultCctor); 
    }

    /**
     * Test of GetId method of class Cage.
     */
    @Test
    public void testGetId() {
        System.out.println("GetId");
        //test case untuk ctor tanpa parameter
        Cage instanceNoParam = new Cage();
        int expResultNoParam = 0;
        int resultNoParam = instanceNoParam.GetId();
        assertEquals(expResultNoParam, resultNoParam);
        //test case untuk ctor dengan parameter
        Cage instanceParam = new Cage(1,1,1,1);
        int expResultParam = 1;
        int resultParam = instanceParam.GetId();
        assertEquals(expResultParam, resultParam);
        //testcase untuk cctor
        Cage instanceCctor = new Cage(2,2,2,2);
        Cage itemCctor = new Cage(instanceCctor);
        int expResultCctor = itemCctor.GetId();
        int resultCctor = instanceCctor.GetId();
        assertEquals(expResultCctor, resultCctor); 
    }

    /**
     * Test of SetCage method, of class Cage.
     */
    @Test
    public void testSetCage() {
        System.out.println("SetCage");
          
        int _x = 1;
        int _y = 1;
        int _id = 1;
        int _animal_id = 1;
        Cage instance = new Cage();
        instance.SetCage(_x, _y, _id, _animal_id);
        //test case param x
        int expResultX = 1;
        int resultX = instance.GetX();
        assertEquals(expResultX, resultX);
        //test case param y
        int expResultY = 1;
        int resultY = instance.GetY();
        assertEquals(expResultY, resultY);
        //test case param id
        int expResultId = 1;
        int resultId = instance.GetId();
        assertEquals(expResultId, resultId);
        //test case param animal_id diambil contoh Animal Kucing
        //test case param weight
        int expKucingWeight = 10;
        int resultKucingWeight = instance.animal.getWeight();
        assertEquals(expKucingWeight, resultKucingWeight);
        //test case param tipe
        int expKucingTipe = 2;
        int resultKucingTipe = instance.animal.getTipe();
        assertEquals(expKucingTipe, resultKucingTipe);
        //test case param tamed
        boolean expKucingTamed = true;
        boolean resultKucingTamed = instance.animal.getTamed();
        assertEquals(expKucingTamed, resultKucingTamed);
        //test case param location_x
        int expKucingLocX = 1;
        int resultKucingLocX = instance.animal.getX();
        assertEquals(expKucingLocX, resultKucingLocX);
        //test case param location_y
        int expKucingLocY = 1;
        int resultKucingLocY = instance.animal.getY();
        assertEquals(expKucingLocY, resultKucingLocY);
    }
    
}
