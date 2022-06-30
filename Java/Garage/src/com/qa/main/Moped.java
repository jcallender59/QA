package com.qa.main;

public class Moped extends Vehicle{

    private boolean gofasterstripes;
    private boolean speedlimiter;

    public Moped (int id, int enginesize, String colour, String vehiclemake, boolean gofasterstripes, boolean speedlimiter) {
        super(id, enginesize, colour, vehiclemake);
        this.gofasterstripes = gofasterstripes;
        this.speedlimiter = speedlimiter;
    }

    public boolean getgofasterstripes() {
        return getgofasterstripes();
    }
    public boolean setgofasterstripes(boolean gofasterstripes) {
        this.gofasterstripes = gofasterstripes;
    }

    public boolean getspeedlimiter() {
        return getspeedlimiter();
    }
    public boolean setspeedlimiter(boolean speedlimiter) {
        this.speedlimiter = speedlimiter;
    }


    @Override
    public double calculateBill() {
        return 0;
    }
}
