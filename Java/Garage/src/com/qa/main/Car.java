package com.qa.main;

public class Car extends Vehicle{

    private boolean Spoiler;
    private boolean DieselEngine;

    public Car(int id, int enginesize, String colour, String vehiclemake, boolean Spoiler, boolean DieselEngine) {
        super(id, enginesize, colour, vehiclemake);
        this.Spoiler = Spoiler;
        this.DieselEngine = DieselEngine;
    }

    public void setspoiler(boolean Spoiler) {
        this.Spoiler = Spoiler;
    }

    public boolean getSpoiler() {
        return Spoiler;
    }

    public void setDieselEngine(boolean DieselEngine) {

    this.DieselEngine = DieselEngine;

    }

    public boolean getDieselEngine() {

        return DieselEngine;
    }


    @Override
    public double calculateBill() {
        return 0;
    }
}
