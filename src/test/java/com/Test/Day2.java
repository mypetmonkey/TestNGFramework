package com.Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void test() {
		System.out.println("day 2 first test");
		
		
	}
	
	@BeforeTest
	public void btest() {
		System.out.println("i will execute at first");
	}
	
	@AfterTest
	
	public void Atest() {
		System.out.println("i will execute at last");
	}
}
