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
 *
 * @author FernandoPozo
 */
public class UtilDateTest {

    public UtilDateTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDayOfWeek method, of class UtilDate.
     */
    @Test
    public void testGetDayOfWeekSuccess() {
        System.out.println("testGetDayOfWeekSuccess");

        Date inputValue = UtilConvertData.convertToDate("01/09/2017 09:00");

        int expResult = 6;
        int result = UtilDate.getDayOfWeek(inputValue);
        assertEquals(expResult, result);

    }

    /**
     * Test of getDayOfWeek method, of class UtilDate.
     */
    @Test
    public void testGetHourAMSuccess() {
        System.out.println("testGetHourAMSuccess");

        Date inputValue = UtilConvertData.convertToDate("01/09/2017 10:00");

        int expResult = 10;
        int result = UtilDate.getHour(inputValue);
        
        assertEquals(expResult, result);

    }

    /**
     * Test of getDayOfWeek method, of class UtilDate.
     */
    @Test
    public void testGetHourPMSuccess() {
        System.out.println("testGetHourPMSuccess");

        Date inputValue = UtilConvertData.convertToDate("01/09/2017 16:00");

        int expResult = 16;
        int result = UtilDate.getHour(inputValue);
        
        assertEquals(expResult, result);

    }
    
    
     /**
     * Test of minute of date
     */
    @Test
    public void testGetMinuteSuccess() {
        System.out.println("testGetMinuteSuccess");

        Date inputValue = UtilConvertData.convertToDate("01/09/2017 16:42");

        int expResult = 42;
        int result = UtilDate.getMinute(inputValue);
        
        assertEquals(expResult, result);

    }

}
