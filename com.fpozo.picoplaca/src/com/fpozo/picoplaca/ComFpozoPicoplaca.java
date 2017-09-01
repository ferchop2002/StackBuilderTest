/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.picoplaca;

import com.fpozo.business.BnPredictor;
import com.fpozo.data.PopulateData;
import com.fpozo.entity.PredictorMovement;
import com.fpozo.entity.Vehicle;
import com.fpozo.message.MessageOutPredictor;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Main class of "Pico y placa" Predictor Software
 *
 * @author FernandoPozo
 */
public class ComFpozoPicoplaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String vehiclePlate;
        String dateOnRoad;
        String hourOnRoad;
        Vehicle oneVehicle = new Vehicle();
        PredictorMovement onePredictorMovement = new PredictorMovement();

        //Populate data 
        PopulateData.initProcess();
        
        System.out.println("********************************");
        System.out.println("********************************");
        System.out.println("Fernando Pozo TEST Pico y Placa");
        System.out.println("********************************");
        System.out.println("********************************");

        try {
            System.out.println("Vehicle Plate:\n");
            vehiclePlate = bf.readLine();

            System.out.println("Date (dd/MM/yyyy):\n");
            dateOnRoad = bf.readLine();

            System.out.println("Hour (hh:mm):\n");
            hourOnRoad = bf.readLine();

            oneVehicle.setVehiclePlate(vehiclePlate);

            onePredictorMovement.setVehicle(oneVehicle);
            onePredictorMovement.setDateVehicleRoad(dateOnRoad);
            onePredictorMovement.setHourVehicleRoad(hourOnRoad);

            MessageOutPredictor response
                    = BnPredictor.isValidCar(onePredictorMovement);

            if (response.getResponse()) {
                System.out.println("The vehicle can road");
            } else {
                System.out.println("Review the following information");

                for (String tempMessage : response.getErrors()) {
                    System.out.println(tempMessage);
                }
            }

        } catch (Exception ex) {
            System.out.println("Error:" + ex.getMessage());
        }

    }

}
