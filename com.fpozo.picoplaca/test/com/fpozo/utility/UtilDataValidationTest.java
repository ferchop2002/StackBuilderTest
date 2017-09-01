/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.utility;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit Test of DataValidation
 * @author FernandoPozo
 */
public class UtilDataValidationTest {
    
    public UtilDataValidationTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Is valid a vehicle with valid plate
     */
    @Test
    public void testIsVehiclePlateSuccess() {
        System.out.println("testIsVehiclePlateSuccess");
        String inputValue = "PBN0123";
        Boolean expResult = true;
        Boolean result = UtilDataValidation.IsVehiclePlate(inputValue);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of wrong vehicle plate
     */
    @Test
    public void testIsVehiclePlateWrongWithLetterInNumber() {
        System.out.println("testIsVehiclePlateWrongWithLetterInNumber");
        String inputValue = "PBNX123";
        Boolean expResult = false;
        Boolean result = UtilDataValidation.IsVehiclePlate(inputValue);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of wrong vehicle plate with number in letter
     */
    @Test
    public void testIsVehiclePlateWrongWithNumberInLetter() {
        System.out.println("testIsVehiclePlateWrongWithNumberInLetter");
        String inputValue = "PB10123";
        Boolean expResult = false;
        Boolean result = UtilDataValidation.IsVehiclePlate(inputValue);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of wrong vehicle plate size
     */
    @Test
    public void testIsVehiclePlateWrongSize() {
        System.out.println("testIsVehiclePlateWrongSize");
        String inputValue = "PB1123";
        Boolean expResult = false;
        Boolean result = UtilDataValidation.IsVehiclePlate(inputValue);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of wrong vehicle with hyphen
     */
    @Test
    public void testIsVehiclePlateWithHyphen() {
        System.out.println("testIsVehiclePlateWrongSize");
        String inputValue = "PB-0123";
        Boolean expResult = false;
        Boolean result = UtilDataValidation.IsVehiclePlate(inputValue);
        assertEquals(expResult, result);
    }

    /**
     * Test of case contain empty
     */
    @Test
    public void testIsStringEmptyCaseEmpty() {
        System.out.println("testIsStringEmptyCaseEmpty");
        String inputValue = "";
        boolean expResult = true;
        boolean result = UtilDataValidation.isStringEmpty(inputValue);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of case contain null
     */
    @Test
    public void testIsStringEmptyCaseNull() {
        System.out.println("testIsStringEmptyCaseNull");
        String inputValue = "";
        boolean expResult = true;
        boolean result = UtilDataValidation.isStringEmpty(inputValue);
        assertEquals(expResult, result);
    }
    
     /**
      * Test of case is not empty or null
     */
    @Test
    public void testIsStringEmptyCaseNotEmpty() {
        System.out.println("testIsStringEmptyCaseNull");
        String inputValue = "TestNotEmpty";
        boolean expResult = false;
        boolean result = UtilDataValidation.isStringEmpty(inputValue);
        assertEquals(expResult, result);
    }
    
}
