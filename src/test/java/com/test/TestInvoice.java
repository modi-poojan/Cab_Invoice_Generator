package com.test;
import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import org.junit.Test;

import com.entities.EnhancedInvoice;
import com.entities.Rides;
import com.services.InvoiceGenerator;

public class TestInvoice {

		InvoiceGenerator invoice = new InvoiceGenerator();
		
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
			EnhancedInvoice invoice1 = new EnhancedInvoice(2, 99, 49.5);
			EnhancedInvoice output2 = invoice.calculateFare(ride);
			assertEquals(invoice1, output2);
		}
	}

