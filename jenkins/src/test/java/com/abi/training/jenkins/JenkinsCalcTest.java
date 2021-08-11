package com.abi.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addtest() {
		
		JenkinsCalc myCalc=new JenkinsCalc();
		assertEquals(10, myCalc.addNumbers(5,5));
	}

	
	@Test
	public void subtractTest() {
		
		JenkinsCalc myCalc=new JenkinsCalc();
		assertEquals(10, myCalc.subtractNumbers(15,5));
	}
}
