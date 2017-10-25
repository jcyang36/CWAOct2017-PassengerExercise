
package com.jcyang;

import java.util.Random;

public class Main {

    static Bus aBus;

    public static void main(String[] args) {
	/*
	This exercise has the following classes:
	- Passenger (each passenger on board). Each passenger has a stop.
	- Bus (the bus that passengers board). A bus has several stops and several passengers.
	- BusStop - the stops available. Stops may be assigned to buses, and passengers also have stops.
	Look at each class to see what it does and how it works.
	* 1. Assign a random bus stop to a passenger
	* 2. Make the bus ply its route with the drive method
	* 3. Let passengers tell the bus driver when they are stopping
	* 4. Let passengers get off the bus
	* */
        setUp();

        System.out.println("Passengers");
        for(Passenger eachPassenger:aBus.getPassengers())
        {
            System.out.println(eachPassenger.getMyName());
            System.out.println(eachPassenger.getMyStop().getStopNumber());
        }

        System.out.println("Stops");
        for(BusStop eachStop : aBus.getStops())
        {
         //   System.out.println(eachStop.getStopName());


        }


        aBus.drive();




    }

    public static void setUp()
    {
        //This prevents you from having to type the passenger details over and over again.
        //If you want the user to enter passenger details, use this method to get input.
        Random randomStop = new Random();
        aBus = new Bus();
        String[] busPassengers={"Adjoa","Benjamin","Colin","Dwamena","Elizabeth"};
        String[] stops={"Lake Forest","Silver Spring","Westfield","Olde Towne","Olney"};


        int counter=0;
        /**All this is for making aBus's stops**/
        for(String aStop:stops)
        {
            aBus.getStops().add(new BusStop(counter,aStop));
            counter++;

        }

        for(String aPassenger:busPassengers)
        {


            //Assign a random bus stop to a passenger
            int myStopNumber = randomStop.nextInt(5);
            Passenger passenger1 = new Passenger(aPassenger);
            BusStop myStop = aBus.getStops().get(myStopNumber);
            passenger1.setMyStop(myStop);
           // System.out.println(myStop.getStopNumber());
            aBus.board(passenger1);
        }


    }
}