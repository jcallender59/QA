package com.qa.main;

public abstract class Vehicle {

    private int id;
    private int enginesize;
    private String colour;
    private String vehiclemake;

}

    public Vehicle(int id, int enginesize, String colour, String vehiclemake) {
        super();
        this.id = id;
        this.enginesize = enginesize;
        this.colour = colour;
        this.vehiclemake = vehiclemake;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getenginesize() {
        return enginesize;
    }

    public void setenginesize(int enginesize) {
        this.enginesize = enginesize;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getvehiclemake() {
        return vehiclemake;
    }

    public void setVehiclemake(String vehiclemake) {
        this.vehiclemake = vehiclemake;
    }

    @Override
    public String toString() {
        return "Vehicle [id=" + id + ", wheels=" + wheels + ", enginesize=" + enginesize + ", colour=" + colour
                + ", vehiclemake=" + vehiclemake + "]";
    }

    public abstract double calculateBill();
