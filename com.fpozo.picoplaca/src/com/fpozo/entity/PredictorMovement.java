/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.entity;

/**
 * Entity of Predictor Movement
 * @author FernandoPozo
 */
public class PredictorMovement {

    private String dateVehicleRoad;
    private String hourVehicleRoad;
    private Vehicle vehicle;
    
    /**
     * @return the dateVehicleRoad
     */
    public String getDateVehicleRoad() {
        return dateVehicleRoad;
    }

    /**
     * @param dateVehicleRoad the dateVehicleRoad to set
     */
    public void setDateVehicleRoad(String dateVehicleRoad) {
        this.dateVehicleRoad = dateVehicleRoad;
    }

    /**
     * @return the hourVehicleRoad
     */
    public String getHourVehicleRoad() {
        return hourVehicleRoad;
    }

    /**
     * @param hourVehicleRoad the hourVehicleRoad to set
     */
    public void setHourVehicleRoad(String hourVehicleRoad) {
        this.hourVehicleRoad = hourVehicleRoad;
    }

    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    
    
}
