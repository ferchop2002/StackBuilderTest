/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.data;

import com.fpozo.constant.ConApplication;
import com.fpozo.entity.RestrictionDay;
import com.fpozo.entity.RestrictionSchedule;
import com.fpozo.utility.UtilConvertData;
import com.fpozo.utility.UtilSharedMemory;

/**
 *
 * @author FernandoPozo
 */
public class PopulateData {

    public static void initProcess() {

        RestrictionDay tempRestrictionDay = new RestrictionDay();

        //Populate day of week
        //Sunday
        tempRestrictionDay.setDayOfWeek(1);
        tempRestrictionDay.setProhibitPlate(ConApplication.Empty);

        UtilSharedMemory.restrictionDay.add(tempRestrictionDay);

        //Monday
        tempRestrictionDay = new RestrictionDay();

        tempRestrictionDay.setDayOfWeek(2);
        tempRestrictionDay.setProhibitPlate("1,2");

        UtilSharedMemory.restrictionDay.add(tempRestrictionDay);

        //Tuesday
        tempRestrictionDay = new RestrictionDay();

        tempRestrictionDay.setDayOfWeek(3);
        tempRestrictionDay.setProhibitPlate("3,4");

        UtilSharedMemory.restrictionDay.add(tempRestrictionDay);

        //Wedsnday
        tempRestrictionDay = new RestrictionDay();

        tempRestrictionDay.setDayOfWeek(4);
        tempRestrictionDay.setProhibitPlate("5,6");

        UtilSharedMemory.restrictionDay.add(tempRestrictionDay);

        //Thurday
        tempRestrictionDay = new RestrictionDay();

        tempRestrictionDay.setDayOfWeek(5);
        tempRestrictionDay.setProhibitPlate("7,8");

        UtilSharedMemory.restrictionDay.add(tempRestrictionDay);

        //Friday
        tempRestrictionDay = new RestrictionDay();

        tempRestrictionDay.setDayOfWeek(6);
        tempRestrictionDay.setProhibitPlate("8,0");

        UtilSharedMemory.restrictionDay.add(tempRestrictionDay);

        //Saturday
        tempRestrictionDay = new RestrictionDay();

        tempRestrictionDay.setDayOfWeek(7);
        tempRestrictionDay.setProhibitPlate(ConApplication.Empty);

        UtilSharedMemory.restrictionDay.add(tempRestrictionDay);
        //end

        //Restricted Schedule
        RestrictionSchedule tempRestrictionSchedule = new RestrictionSchedule();

        //Schedule morning
        tempRestrictionSchedule.setHourStart(UtilConvertData.convertHourToDate("07:00"));
        tempRestrictionSchedule.setHourEnd(UtilConvertData.convertHourToDate("09:30"));

        UtilSharedMemory.restrictionSchedule.add(tempRestrictionSchedule);

        //schedule afternoon
        tempRestrictionSchedule = new RestrictionSchedule();

       tempRestrictionSchedule.setHourStart(UtilConvertData.convertHourToDate("16:00"));
        tempRestrictionSchedule.setHourEnd(UtilConvertData.convertHourToDate("19:30"));

        UtilSharedMemory.restrictionSchedule.add(tempRestrictionSchedule);

    }

}
