package com.services;

import com.entities.EnhancedInvoice;
import com.entities.Rides;

public class InvoiceGenerator {

	public static final double FARE_PER_KILOMETER = 10.0;
	public static final double FARE_PER_MINUTE = 1;
	public static final double MINIMUM_FARE = 5;
	double totalFare = 0;
	
	public double calculateFare(double distance, double time) {
		totalFare = distance *FARE_PER_KILOMETER + time * FARE_PER_MINUTE;
		if(totalFare < 5)
			totalFare = 5;
		return (totalFare);
	}
	
	public EnhancedInvoice calculateFare(Rides[] rides) {
		for (Rides r : rides) {
			totalFare += calculateFare(r.distance,r.time);
		}
		if(totalFare < 5)
			totalFare = 5;
		return new EnhancedInvoice(rides.length, totalFare , totalFare/rides.length);
	}
	
	/*
	 * public EnhancedInvoice invoice(Rides[] rides) { for (Rides r : rides) {
	 * totalFare += calculateFare(r.distance,r.time); } if(totalFare < 5) totalFare
	 * = 5;
	 * 
	 * }
	 */
}
