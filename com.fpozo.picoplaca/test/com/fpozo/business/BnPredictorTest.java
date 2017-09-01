/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.business;

import com.fpozo.data.PopulateData;
import com.fpozo.entity.PredictorMovement;
import com.fpozo.entity.Vehicle;
import com.fpozo.message.MessageOutPredictor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test Business Predictor
 * @author FernandoPozo
 */
public class BnPredictorTest {
    
    public BnPredictorTest() {
    }
    
    @Before
    public void setUp() {
        
        //Populate data 
        //Restriction date and Restriction schedule
        PopulateData.initProcess();
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test valid car 1
     */
    @Test
    public void testIsValidCarOnRoad() {
        System.out.println("testIsValidCarOnRoad");
        
        PredictorMovement predictorMovement = new PredictorMovement();
        
        Vehicle oneVehicle = new Vehicle();
        
        oneVehicle.setVehiclePlate("PNB0120");
        
        predictorMovement.setVehicle(oneVehicle);
        predictorMovement.setDateVehicleRoad("01/09/2017");
        predictorMovement.setHourVehicleRoad("08:00");
        
        MessageOutPredictor expResult = new MessageOutPredictor();
        
        expResult.setResponse(false);
        
        MessageOutPredictor result = BnPredictor.isValidCar(predictorMovement);
        
        assertEquals(expResult.getResponse(), result.getResponse());
        
        
    }
    /**
     * Test valid car 2
     */
    @Test
    public void testIsValidCarOnRoad2() {
        System.out.println("testIsValidCarOnRoad2");
        
        PredictorMovement predictorMovement = new PredictorMovement();
        
        Vehicle oneVehicle = new Vehicle();
        
        oneVehicle.setVehiclePlate("PNB0120");
        
        predictorMovement.setVehicle(oneVehicle);
        predictorMovement.setDateVehicleRoad("01/09/2017");
        predictorMovement.setHourVehicleRoad("07:01");
        
        MessageOutPredictor expResult = new MessageOutPredictor();
        
        expResult.setResponse(false);
        
        MessageOutPredictor result = BnPredictor.isValidCar(predictorMovement);
        
        assertEquals(expResult.getResponse(), result.getResponse());
        
        
    }
    
    /**
     * Test valid car 3
     */
    @Test
    public void testIsValidCarOnRoad3() {
        System.out.println("testIsValidCarOnRoad3");
        
        PredictorMovement predictorMovement = new PredictorMovement();
        
        Vehicle oneVehicle = new Vehicle();
        
        oneVehicle.setVehiclePlate("PNB0120");
        
        predictorMovement.setVehicle(oneVehicle);
        predictorMovement.setDateVehicleRoad("01/09/2017");
        predictorMovement.setHourVehicleRoad("09:29");
        
        MessageOutPredictor expResult = new MessageOutPredictor();
        
        expResult.setResponse(false);
        
        MessageOutPredictor result = BnPredictor.isValidCar(predictorMovement);
        
        assertEquals(expResult.getResponse(), result.getResponse());
        
        
    }
    
    /**
     * Valid before hour
     */
    @Test
    public void testIsValidBeforeHour() {
        System.out.println("testIsValidBeforeHour");
        
        PredictorMovement predictorMovement = new PredictorMovement();
        
        Vehicle oneVehicle = new Vehicle();
        
        oneVehicle.setVehiclePlate("PNB0120");
        
        predictorMovement.setVehicle(oneVehicle);
        predictorMovement.setDateVehicleRoad("01/09/2017");
        predictorMovement.setHourVehicleRoad("06:59");
        
        MessageOutPredictor expResult = new MessageOutPredictor();
        
        expResult.setResponse(true);
        
        MessageOutPredictor result = BnPredictor.isValidCar(predictorMovement);
        
        assertEquals(expResult.getResponse(), result.getResponse());
        
        
    }
    
    /**
     * valid car on Sunday
     */
    @Test
    public void testIsValidCarOnSunday() {
        System.out.println("testIsValidCarOnSunday");
        
        PredictorMovement predictorMovement = new PredictorMovement();
        
        Vehicle oneVehicle = new Vehicle();
        
        oneVehicle.setVehiclePlate("PNB0120");
        
        predictorMovement.setVehicle(oneVehicle);
        predictorMovement.setDateVehicleRoad("03/09/2017");
        predictorMovement.setHourVehicleRoad("08:00");
        
        MessageOutPredictor expResult = new MessageOutPredictor();
        
        expResult.setResponse(true);
        
        MessageOutPredictor result = BnPredictor.isValidCar(predictorMovement);
        
        assertEquals(expResult.getResponse(), result.getResponse());
        
        
    }
    
    
    /**
     * Car after hour
     */
    @Test
    public void testIsValidCarAfterHour() {
        System.out.println("testIsValidCarAfterHour");
        
        PredictorMovement predictorMovement = new PredictorMovement();
        
        Vehicle oneVehicle = new Vehicle();
        
        oneVehicle.setVehiclePlate("PNB0120");
        
        predictorMovement.setVehicle(oneVehicle);
        predictorMovement.setDateVehicleRoad("01/09/2017");
        predictorMovement.setHourVehicleRoad("09:31");
        
        MessageOutPredictor expResult = new MessageOutPredictor();
        
        expResult.setResponse(true);
        
        MessageOutPredictor result = BnPredictor.isValidCar(predictorMovement);
        
        assertEquals(expResult.getResponse(), result.getResponse());
        
        
    }
    
    /**
     * Wrong plate
     */
    @Test
    public void testIsValidCarWrongPlate() {
        System.out.println("testIsValidCarWrongPlate");
        
        PredictorMovement predictorMovement = new PredictorMovement();
        
        Vehicle oneVehicle = new Vehicle();
        
        oneVehicle.setVehiclePlate("PNBX120");
        
        predictorMovement.setVehicle(oneVehicle);
        predictorMovement.setDateVehicleRoad("01/09/2017");
        predictorMovement.setHourVehicleRoad("09:31");
        
        MessageOutPredictor expResult = new MessageOutPredictor();
        
        expResult.setResponse(false);
        
        MessageOutPredictor result = BnPredictor.isValidCar(predictorMovement);
        
        assertEquals(expResult.getResponse(), result.getResponse());
        
        
    }
    
    /**
     * Wrong date
     */
    @Test
    public void testIsValidCarWrongDate() {
        System.out.println("testIsValidCarAfterHour");
        
        PredictorMovement predictorMovement = new PredictorMovement();
        
        Vehicle oneVehicle = new Vehicle();
        
        oneVehicle.setVehiclePlate("PNB0120");
        
        predictorMovement.setVehicle(oneVehicle);
        predictorMovement.setDateVehicleRoad("01/13/2017");
        predictorMovement.setHourVehicleRoad("09:31");
        
        MessageOutPredictor expResult = new MessageOutPredictor();
        
        expResult.setResponse(false);
        
        MessageOutPredictor result = BnPredictor.isValidCar(predictorMovement);
        
        assertEquals(expResult.getResponse(), result.getResponse());
        
        
    }
    
    /**
     * Wrong hour
     */
    @Test
    public void testIsValidCarWrongHour() {
        System.out.println("testIsValidCarWrongHour");
        
        PredictorMovement predictorMovement = new PredictorMovement();
        
        Vehicle oneVehicle = new Vehicle();
        
        oneVehicle.setVehiclePlate("PNB0120");
        
        predictorMovement.setVehicle(oneVehicle);
        predictorMovement.setDateVehicleRoad("01/11/2017");
        predictorMovement.setHourVehicleRoad("25:31");
        
        MessageOutPredictor expResult = new MessageOutPredictor();
        
        expResult.setResponse(false);
        
        MessageOutPredictor result = BnPredictor.isValidCar(predictorMovement);
        
        assertEquals(expResult.getResponse(), result.getResponse());
        
        
    }
    
}
