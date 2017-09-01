/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.entity;

/**
 * Restriction Day
 *
 * @author FernandoPozo
 */
public class RestrictionDay {

    private int dayOfWeek;
    private String prohibitPlate;

    /**
     * @return the dayOfWeek
     */
    public int getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * @param dayOfWeek the dayOfWeek to set
     */
    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * @return the prohibitPlate
     */
    public String getProhibitPlate() {
        return prohibitPlate;
    }

    /**
     * @param prohibitPlate the prohibitPlate to set
     */
    public void setProhibitPlate(String prohibitPlate) {
        this.prohibitPlate = prohibitPlate;
    }

}
