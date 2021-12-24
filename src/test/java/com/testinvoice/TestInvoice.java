package com.testinvoice;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import org.junit.Test;

import com.cabinvoice.CalculateInvoice;
public class TestInvoice {

		CalculateInvoice invoice = new CalculateInvoice();
		
		@Test
		public void validateInvoice() {
			int output = invoice.calculateFare(4, 7);
			assertEquals(47, output);
		}
	}

