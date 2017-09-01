/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.entity;

import java.util.Date;

/**
 * Restriction Schedule 
 * @author FernandoPozo
 */
public class RestrictionSchedule {

    private Date hourStart;
    private Date hourEnd;

  

    /**
     * @return the hour
     */
    public Date getHourStart() {
        return hourStart;
    }

    /**
     * @param hour the hour to set
     */
    public void setHourStart(Date hour) {
        this.hourStart = hour;
    }


    /**
     * @return the hourEnd
     */
    public Date getHourEnd() {
        return hourEnd;
    }

    /**
     * @param hourEnd the hourEnd to set
     */
    public void setHourEnd(Date hourEnd) {
        this.hourEnd = hourEnd;
    }


}
