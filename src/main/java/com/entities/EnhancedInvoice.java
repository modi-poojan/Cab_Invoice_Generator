package com.entities;

public class EnhancedInvoice {

	int totalRides;
	double totalFare;
	double avgFare;
	
	public EnhancedInvoice(int totalRides, double totalFare, double avgFare) {
		super();
		this.totalRides = totalRides;
		this.totalFare = totalFare;
		this.avgFare = avgFare;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		if(obj == null) 
			return false;
		if(getClass() != obj.getClass())
			return false;
		EnhancedInvoice invoice = (EnhancedInvoice) obj;
		return Double.doubleToLongBits(avgFare) == Double.doubleToLongBits(invoice.avgFare)
				&& totalRides == invoice.totalRides
				&&Double.doubleToLongBits(totalFare)==Double.doubleToLongBits(invoice.totalFare);
	}

}


