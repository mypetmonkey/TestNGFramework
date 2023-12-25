package com.Test;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void WebloginCarLoan() {
		//selenium
		System.out.println("WebloginCarLoan");
	}

	@Test(timeOut=5000)
	public void MobileloginCarLoan() {
		//appium
		System.out.println("MobileloginCarLoan");

	}
	
	@Test(groups="smoke")
	public void loginApiCarLoan() {
		//Rest api automation
		System.out.println("loginApiCarLoan");

	}

}
