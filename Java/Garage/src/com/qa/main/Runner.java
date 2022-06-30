package com.qa.main;

public class Runner {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Car c = new Car(1, 1800, "Red", "Audi", false, false);

        garage.addVehicle(c);


        garage.calculateBill();

        garage.listVehicles();

    }
}