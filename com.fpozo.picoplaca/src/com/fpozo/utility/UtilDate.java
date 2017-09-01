/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.utility;

import java.util.Calendar;
import java.util.Date;

/**
 * Utility Date
 * @author FernandoPozo
 */
public class UtilDate {

    /**
     * Get day of week 
     * @param inputValue Date
     * @return Day of week 1 is Sunday to 7 Saturday
     */
    public static int getDayOfWeek(Date inputValue) {

        Calendar c = Calendar.getInstance();
        int returnValue;

        c.setTime(inputValue);
        
        returnValue = c.get(Calendar.DAY_OF_WEEK);

        return returnValue;
    }
    
    /**
     * Get Hour
     * @param inputValue
     * @return 
     */
    public static int getHour(Date inputValue) {

        Calendar c = Calendar.getInstance();
        int returnValue;

        c.setTime(inputValue);
        
        returnValue = c.get(Calendar.HOUR_OF_DAY);

        return returnValue;
    }
    
    
    /**
     * Get Minute
     * @param inputValue
     * @return 
     */
    public static int getMinute(Date inputValue) {

        Calendar c = Calendar.getInstance();
        int returnValue;

        c.setTime(inputValue);
        
        returnValue = c.get(Calendar.MINUTE);

        return returnValue;
    }

}
