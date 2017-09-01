/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.utility;

import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test of Utility of convert data
 * @author FernandoPozo
 */
public class UtilConvertDataTest {
    
    public UtilConvertDataTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Success date
     */
    @Test
    public void testConvertToDateSuccess() {
        System.out.println("testConvertToDateSuccess");
        String inputValue = "01/01/2017 08:08";
        Date expResult = null;
        Date result = UtilConvertData.convertToDate(inputValue);
        assertNotEquals(expResult, result);
        
    }
    
    /**
     * Wrong date month over 12
     */
    @Test
    public void testConvertToDateWrongMonthDate() {
        System.out.println("testConvertToDateWrongMonthDate");
        String inputValue = "01/25/2017 08:08";
        Date expResult = null;
        Date result = UtilConvertData.convertToDate(inputValue);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test wrong format in date
     */
    @Test
    public void testConvertToDateWrongformatDate() {
        System.out.println("testConvertToDateWrongformatDate");
        String inputValue = "01-25-2017 08:08";
        Date expResult = null;
        Date result = UtilConvertData.convertToDate(inputValue);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Wrong format hour
     */
    @Test
    public void testConvertToDateWrongformatHour() {
        System.out.println("testConvertToDateWrongformatHour");
        String inputValue = "01/25/2017 0808";
        Date expResult = null;
        Date result = UtilConvertData.convertToDate(inputValue);
        assertEquals(expResult, result);
        
    }
    
}
