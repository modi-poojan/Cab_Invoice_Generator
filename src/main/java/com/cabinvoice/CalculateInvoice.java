package com.cabinvoice;

public class CalculateInvoice {

	public static final int COST_PER_KILOMETER = 10;
	public static final int COST_PER_MINUTE = 1;
	public static final int MINIMUM_FARE = 5;
	
	public int calculateFare(int distance, int time) {
		int totalFare = distance * COST_PER_KILOMETER + time * COST_PER_MINUTE;
		if(totalFare < 5)
			totalFare = 5;
		return (totalFare);
	}
}
