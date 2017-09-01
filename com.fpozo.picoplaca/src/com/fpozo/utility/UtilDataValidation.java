/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.utility;

import com.fpozo.constant.ConApplication;


/**
 * Utility of Data Validation it can use validate if a string is a valid vehicle
 * plate or is valid date or time
 *
 * @author FernandoPozo
 */
public class UtilDataValidation {

    /**
     * Detect if a vehicle has a valid vehicle plate
     *
     * @param inputValue
     * @return
     */
    public static Boolean IsVehiclePlate(String inputValue) {
        Boolean isSuccess = false;
        String tempVarValidation = ConApplication.Empty;

        if (!isStringEmpty(inputValue)) {

            //the vehicle plate shouldn't have hyphen
            if (!inputValue.contains(ConApplication.hyphen)) {

                //Vehicle plate should have a exaclty size
                if (ConApplication.TotalSizeVehiclePlate == inputValue.length()) {

                    tempVarValidation = inputValue.substring(0, 3);

                    //validate if have a part only alphabet
                    isSuccess = tempVarValidation.matches("[a-zA-Z]+");

                    if (isSuccess) {

                        tempVarValidation = inputValue.substring(3);

                        //validate if have a part only numbers
                        isSuccess = tempVarValidation
                                .matches(ConApplication.RegExOnlyNumbers);

                        //if it passed here, the vehicle plate is valided
                    }

                }

            }

        }

        return isSuccess;
    }

    /**
     * Is String null or empty
     *
     * @param inputValue String value
     * @return
     */
    public static boolean isStringEmpty(String inputValue) {

        Boolean isSuccess = false;

        if (ConApplication.Empty.equals(inputValue) || null == inputValue) {
            isSuccess = true;
        }

        return isSuccess;
    }

    

}
