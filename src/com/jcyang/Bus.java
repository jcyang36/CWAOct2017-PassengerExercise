package com.jcyang;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private ArrayList<Passenger> passengers;
    private ArrayList<BusStop> stops;

    public Bus()
    {
        passengers = new ArrayList<Passenger>();
        stops = new ArrayList<BusStop>();

    }
    public void alight(Passenger p)
    {
        passengers.remove(p);
    }

    public void board(Passenger p)
    {
        passengers.add(p);
    }

    public BusStop findStop(int stopNumber){

        //This is an example of how to search for a particular bus stop. It is not used in the example, because different
        // bus stop objects are used for passengers and the bus. Note that though the stops have the same information, they
        // are NOT the same object.

        for(BusStop s:stops)
        {
            if(s.getStopNumber()==stopNumber)
                return s;
        }
        return null;
    }

    public void drive()
    {

        for(BusStop s:stops)
        {
            //Each passenger should annoucne his/her stop when the bus stops at the right place
            for(Passenger eachPassenger:this.getPassengers()){
                    if(eachPassenger.getMyStop().equals(s)) {

                        System.out.println(eachPassenger.getMyName()+": "+eachPassenger.sayStop());
                    }
            }
            System.out.println("The bus has stopped at "+s.getStopName()+", stop "+s.getStopNumber());

            //Each passenger should get off the bus (see the ArrayList Example for hints on what to do)


            List<Passenger> toRemove = new ArrayList<>();
            for (Passenger eachPassenger:this.getPassengers()) {
                if (eachPassenger.getMyStop().equals(s)) {
                    toRemove.add(eachPassenger);
                    System.out.println(eachPassenger.getMyName()+" : I'm getting off the bus");
                }
            }
            passengers.removeAll(toRemove);
            System.out.println("These passengers are still on the bus: ");
            System.out.println("<-------------->");
for( Passenger eachPassenger:this.getPassengers()) {

    System.out.println(eachPassenger.getMyName() );
}
            System.out.println("<-------------->");


        }
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public ArrayList<BusStop> getStops() {
        return stops;
    }

    public void setStops(ArrayList<BusStop> stops) {
        this.stops = stops;
    }

    public void addStop(BusStop b)
    {
        this.stops.add(b);
    }


}