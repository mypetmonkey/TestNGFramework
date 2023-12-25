package com.Test;

import org.testng.annotations.Test;

public class Day1 {
	
	@Test(enabled =false)
	public void test1() {
		System.out.println("day 1 first test");
	}
	
	@Test(groups="smoke")
	public void test2() {
		System.out.println("day 1 second test");
	}

}
