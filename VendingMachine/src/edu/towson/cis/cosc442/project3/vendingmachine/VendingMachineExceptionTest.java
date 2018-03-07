package edu.towson.cis.cosc442.project3.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineExceptionTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVendingMachineException() {
		try{
		new VendingMachineException();
		assertFalse(false);
		}
		catch(Exception e){
			assertTrue(true);
		}
	}

}
