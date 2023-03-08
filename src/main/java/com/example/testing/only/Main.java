package com.example.testing.only;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Please enter your full name:");
        String name = reader.nextLine();

        System.out.println("Now, please enter your departure date as YYYY-MM-DD:");
        String sdepart = reader.nextLine();
        LocalDate depart = LocalDate.parse(sdepart);

        System.out.println("Now, please enter your return date as YYYY-MM-DD:");
        String sreturn = reader.nextLine();
        LocalDate returnDate = LocalDate.parse(sreturn);
        
        System.out.println("How many children as passengers. Enter 0 if none: ");
        int children = reader.nextInt();

        System.out.println("How many adults as passengers: ");
        int adults = reader.nextInt();

        FlightBooking flightbooking = new FlightBooking(name, depart, returnDate, children, adults);

        flightbooking.setTripSource("1");
        flightbooking.setTripDestination("1", "2");

        flightbooking.setTripType("2");
        flightbooking.setBookingClass("1");

        flightbooking.setDepartingTicketPrice(2, 5);
        flightbooking.setReturnTicketPrice();

        flightbooking.setTotalTicketPrice();

        String sdepart2 = "2023-03-04";
        LocalDate departureDate = LocalDate.parse(sdepart2);

        String sreturn2 = "2023-03-05";
        LocalDate returnDate2 = LocalDate.parse(sreturn2);

        flightbooking.setDepartureDate(departureDate);
        flightbooking.setReturnDate(returnDate2);


/* 
        flightbooking.setTotalPassengers(children, adults);
        flightbooking.setFlightID(name);
        flightbooking.setTicketNumber(name);
        flightbooking.setDepartureDate(depart);
        flightbooking.setReturnDate(returnDate);
        flightbooking.setDepartingTicketPrice(children, adults);
        flightbooking.setReturnTicketPrice();
        flightbooking.setTotalTicketPrice();*/
    
        System.out.println(flightbooking);
        
        reader.close();
    }
}
