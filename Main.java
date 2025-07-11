//Author : Lizwi Truth Mhlaba.
//Project: Vehicle MAnagement System.
//Date: 08 July 2025
//Main.java

package com.cars;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * This class represents the main application for managing vehicles.
 */

public class Main {

    public static void main(String[] args){
                        //Create a new Scanner object to read input from the user.

        Scanner input = new Scanner(System.in);

                        //Create a collection to store vehicle objects
        Collection<Car> cars = new ArrayList<Car>();

                        //Display the welcome message and menu options
        System.out.println("Welcome to the Vehicle Management System!");
        System.out.println("(1) Capture vehicle details");
        System.out.println("(2) View vehicle report");
        System.out.println("(3) Exist application");

                             //Read the user's menu option choice
        int menuOption = input.nextInt();
        System.out.println("Logged: " + menuOption);

                            //Continue to display the menu and process user input until the user choooses to exit
        while(menuOption !=3){

            if(menuOption == 1){
                            //Create a new Car object to store the vehicle's details
                Car carObj = new Car();
                            //Read the vehicle's details from the users
                int year;
                int millage;
                String model;
                String plateNum = "";
                String vinNum;

                System.out.println("Enter make");
                String make = input.next();

                System.out.println("Enter model");
                model = input.next();

                System.out.println("Enter vinNum");
                vinNum = input.next();

                                //Validate the VIN number to ensure it is 17 characters long
                while(!(vinNum.length() == 17)){

                    System.out.println("Enter vin and make sure its 17 characters long");
                    vinNum = input.next();
                }
                                    //Ask  the user to choose the license plate number format
                System.out.println("Please select a license plate number format: ");
                System.out.println("(1) Old format");

                int plateChoice = Integer.parseInt(input.next());

                                        // Read the license plate number if the user chose the old format
                if(plateChoice == 1){
                    System.out.println("Enter plate number e.g FMT740MP");
                    plateNum = input.next();
                }
                                        // Read the vehicle's millage and year

                System.out.println("Enter vehicle millage: ");
                millage = input.nextInt();

                System.out.println("Enter vehicle year: ");
                year = input.nextInt();

                                    // Set the vehicle's details in the Car object
                carObj.setMake(make);
                carObj.setModel(model);

                carObj.setPlateNumber(plateNum);
                carObj.setVin(vinNum);

                carObj.setYear(year);
                carObj.setMillage(millage);

                                    // Add the Car object to the collection of vehicles
                cars.add(carObj);
                System.out.println("Vehicle details captured successfully!");

            }else if(menuOption == 2){

                if(cars.isEmpty()){
                    System.out.println("There are no vehicles captured");
                }else {
                                    // Display the vehicle report
                    System.out.println("********************");
                    System.out.println("VEHICLE REPORT");
                    System.out.println("********************");

                    for (Car carObject: cars){
                        System.out.println("MAKE: " + carObject.getMake());
                        System.out.println("MODEL: " + carObject.getModel());
                        System.out.println("VIN: " + carObject.getVin());
                        System.out.println("Plate Number: " + carObject.getPlateNumber());
                        System.out.println("Millage: " + carObject.getMillage());
                        System.out.println("Year: " + carObject.getYear());
                        System.out.println();
                    }
                }
            }

                                // Display the menu options again and read the user's next choice
            System.out.println("Please select an option");
            System.out.println("(1) Capture vehicle details");
            System.out.println("(2) View vehicle report");
            System.out.println("(3) Exist application");

            menuOption = input.nextInt();
        }

                                // Display a thank-you message when the user exits the application
        System.out.println("Thanks for using the Vehicle Management System!");
    }

}
