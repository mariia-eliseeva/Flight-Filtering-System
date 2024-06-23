package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        System.out.println("Все перелёты:");
        flights.forEach(System.out::println);

        System.out.println("\nИсключить перелёты с вылетом до текущего момента времени:");
        List<Flight> filteredFlights1 = FlightFilter.excludeDeparturesBeforeNow(flights);
        filteredFlights1.forEach(System.out::println);

        System.out.println("\nИсключить перелёты с сегментами, где дата прилёта раньше даты вылета:");
        List<Flight> filteredFlights2 = FlightFilter.excludeArrivalBeforeDeparture(flights);
        filteredFlights2.forEach(System.out::println);

        System.out.println("\nИсключить перелёты с общим временем на земле более двух часов:");
        List<Flight> filteredFlights3 = FlightFilter.excludeMoreThanTwoHoursGroundTime(flights);
        filteredFlights3.forEach(System.out::println);
    }
}
