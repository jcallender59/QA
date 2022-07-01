package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println("Vehicle added");
    }

    public void removeVehicle(Vehicle v) {
        vehicles.remove(v);
        System.out.println("Vehicle removed");
    }

    public void listVehicles() {
        System.out.println("Full vehicle list: \n");
        System.out.println(vehicles.toString());
    }

    public void emptyGarage() {
        vehicles.clear();
        System.out.println("All vehicles removed!");
        ;
    }

    public void billAll() {
        for (Vehicle v : vehicles) {
            calculateBill(v);
        }
    }

    
    int carCost = 1000;
    int mopedCost = 300;
    int vanCost = 500;
    int totalcost;

    public void calculateBill(Vehicle v) {

        if (v instanceof Car) {
            totalcost = (int) (carCost * v.getenginesize());
        } else if (v instanceof Moped) {
            totalcost = (int) (mopedCost * v.getenginesize());
        } else if (v instanceof Van) {
            totalcost = (int) (vanCost * v.getenginesize());

        } else {
            System.out.println("No Vehicle of this type exists");


        }
    }

    public void calculateBill() {
    }
}