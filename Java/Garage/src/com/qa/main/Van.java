package com.qa.main;

public class Van extends Vehicle{

    private boolean largeloadarea;
    private boolean slidingdoor;

    public Van(int id, int enginesize, String colour, String vehiclemake, boolean largeloadarea, boolean slidingdoor) {
        super(id, enginesize, colour, vehiclemake);
        this.largeloadarea = largeloadarea;
        this.slidingdoor = slidingdoor;
    }

    public boolean getlargeloadarea() {
        return getlargeloadarea();
    }
    public void setlargeloadarea(boolean largeloadarea) {
        this.largeloadarea = largeloadarea;
    }

    public boolean getslidingdoor() {
        return getslidingdoor();
    }
    public void setslidingdoor(boolean slidingdoor) {
        this.slidingdoor = slidingdoor;
    }


    @Override
    public double calculateBill() {
        return 0;
    }
}
