/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.business;

import com.fpozo.constant.ConApplication;
import com.fpozo.constant.ConErrorMessage;
import com.fpozo.entity.PredictorMovement;
import com.fpozo.entity.RestrictionDay;
import com.fpozo.entity.RestrictionSchedule;
import com.fpozo.message.MessageOutPredictor;
import com.fpozo.utility.UtilDataValidation;
import com.fpozo.utility.UtilConvertData;
import com.fpozo.utility.UtilDate;
import com.fpozo.utility.UtilSharedMemory;
import java.util.Date;

/**
 * Business Class to predict a vehicle
 *
 * @author FernandoPozo
 */
public class BnPredictor {

    /**
     * Detect if vehicle can road in that date
     *
     * @param predictorMovement
     * @return
     */
    public static MessageOutPredictor isValidCar(PredictorMovement predictorMovement) {
        MessageOutPredictor messageReturn = new MessageOutPredictor();
        Date dateMovement;
        Date hourMovement;
        int dayOnRoad;
        String lastDigitPlate;
        Boolean restrictionVehicle = false;

        messageReturn.setResponse(false);

        if (null != predictorMovement) {

            if (UtilDataValidation.
                    IsVehiclePlate(predictorMovement.getVehicle().getVehiclePlate())) {

                //Join date with hour
                dateMovement = UtilConvertData.convertToDate(
                        predictorMovement.getDateVehicleRoad() + ConApplication.Space
                        + predictorMovement.getHourVehicleRoad());

                if (null != dateMovement) {
                    //all data are valid
                    dayOnRoad = UtilDate.getDayOfWeek(dateMovement);

                    hourMovement = UtilConvertData.convertHourToDate(predictorMovement.getHourVehicleRoad());

                    //The last digit in plate
                    lastDigitPlate = predictorMovement.getVehicle().getVehiclePlate();
                    lastDigitPlate = lastDigitPlate.substring(lastDigitPlate.length() - 1);

                    for (RestrictionDay tempRestrictionDay : UtilSharedMemory.restrictionDay) {

                        if (dayOnRoad == tempRestrictionDay.getDayOfWeek()) {

                            if (tempRestrictionDay.getProhibitPlate().contains(lastDigitPlate)) {
                                restrictionVehicle = true;
                            }

                            break;
                        }

                    }

                    //Have to valid if the behicle can road in shedule
                    if (restrictionVehicle) {
                        

                        for (RestrictionSchedule tempRestrictionSchedule : UtilSharedMemory.restrictionSchedule) {

                            Date hourStart = tempRestrictionSchedule.getHourStart();
                            Date hourEnd = tempRestrictionSchedule.getHourEnd();

                            if (hourMovement.after(hourStart) && hourMovement.before(hourEnd)) {
                                restrictionVehicle = false;
                                break;
                            }

                        }

                        messageReturn.setResponse(restrictionVehicle);

                        if (!restrictionVehicle) {
                            messageReturn.getErrors().add(ConErrorMessage.VehicleNotRoad);
                        }

                    } else {
                        //The vehicle is not restricted
                        messageReturn.setResponse(true);
                    }

                } else {
                    //Date not valid
                    messageReturn.getErrors().add(ConErrorMessage.DateNotValid);
                }

            } else {
                //Vehicle plate not valid
                messageReturn.getErrors().add(ConErrorMessage.VehiclePlateNotValid);
            }

        } else {
            //type dat not valid
            messageReturn.getErrors().add(ConErrorMessage.TypeDateNotValid);
        }

        return messageReturn;
    }

}
