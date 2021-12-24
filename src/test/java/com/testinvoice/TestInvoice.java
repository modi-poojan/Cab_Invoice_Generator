package com.testinvoice;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import org.junit.Test;

import com.cabinvoice.CalculateInvoice;
import com.cabinvoice.Rides;
public class TestInvoice {

		CalculateInvoice invoice = new CalculateInvoice();
		
		@Test
		public void validateInvoice_Regular() {
			double output = invoice.calculateFare(4.8, 14);
			assertEquals(62, output);
		}
		
		@Test
		public void validateInvoice_min() {
			double output1 = invoice.calculateFare(0.3, 0.1);
			assertEquals(5, output1);			
		}
		
		@Test
		public void multipleRidesInvoice() {
			Rides [] ride = {new Rides(5.4, 17),new Rides(1.7, 11)};
			double output2 = invoice.calculateFare(ride);
			assertEquals(99, output2);
		}
	}

