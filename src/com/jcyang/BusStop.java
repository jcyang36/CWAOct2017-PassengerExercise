package com.jcyang;

public class BusStop {

    private int stopNumber;
    private String stopName;


    public BusStop()
    {

    }

    public BusStop(int number, String name)
    {
        this.stopNumber=number;
        this.stopName = name;
    }
    public int getStopNumber() {
        return stopNumber;
    }

    public void setStopNumber(int stopNumber) {
        this.stopNumber = stopNumber;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }


}
