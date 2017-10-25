package com.jcyang;

public class Passenger {
    private BusStop myStop;
    private String myName;

    public Passenger()
    {
        myStop = new BusStop();
    }

    public Passenger(String aPassenger)
    {
        myStop = new BusStop();
        setMyName(aPassenger);
    }

    public String announceStop()
    {
        return this.myStop.getStopName()+" is my stop!";
    }

    public String sayStop()
    {
        return "Stop, please!";
    }

    public BusStop getMyStop() {
        return myStop;
    }

    public void setMyStop(BusStop myStop) {
        this.myStop = myStop;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}