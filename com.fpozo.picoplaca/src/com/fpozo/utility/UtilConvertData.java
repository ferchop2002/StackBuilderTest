/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.utility;

import com.fpozo.constant.ConApplication;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Utility
 *
 * @author FernandoPozo
 */
public class UtilConvertData {

    /**
     * Convert to Date
     *
     * @param inputValue
     * @return
     */
    public static Date convertToDate(String inputValue) {

        Date dateReturn;
        DateFormat dateFormat = new SimpleDateFormat(ConApplication.FormatDateHour);

        dateFormat.setLenient(false);
        
        try {        
            dateReturn = dateFormat.parse(inputValue);     
        } catch (ParseException ex) {
            dateReturn = null;
        }

        return dateReturn;
    }
    
    
    
    /**
     * Convert an format hour in date
     * @param inputValue
     * @return 
     */
    public static Date convertHourToDate(String inputValue) {

        Date dateReturn;
        DateFormat dateFormat = new SimpleDateFormat(ConApplication.FormatHour);

        dateFormat.setLenient(false);
        
        try {        
            dateReturn = dateFormat.parse(inputValue);     
        } catch (ParseException ex) {
            dateReturn = null;
        }

        return dateReturn;
    }
    
    
}
