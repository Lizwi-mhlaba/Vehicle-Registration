//Author : Lizwi Truth Mhlaba.
//Project: Vehicle MAnagement System.
//Date: 08 July 2025

package com.cars;

/**
 * This class represents a vehicle with attributes such as make, model, plate number, VIN, year, and millage.
 */

public class Car{

            // Attributes
    private String make;
    private String model;
    private String vin;
    private String plateNumber;
    private int year;
    private int millage;

                 // Constructor
    public Car() {}

                // Getters and setters for the attributes
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
    public String getPlateNumber() {
        return plateNumber;
    }
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMillage() {
        return millage;
    }
    public void setMillage(int millage) {
        this.millage = millage;
    }
}
