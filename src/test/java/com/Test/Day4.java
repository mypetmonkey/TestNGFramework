package com.Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String url) {
		//selenium
		System.out.println("WebloginHomeLoan");
		System.out.println(url);
	}

	@Test(groups="smoke")
	public void MobileloginHomeLoan() {
		//appium
		System.out.println("MobileloginHomeLoan");

	}
	
	@Test(dependsOnMethods="WebloginHomeLoan")
	public void loginApiHomeLoan() {
		//Rest api automation
		System.out.println("loginApiHomeLoan");

	}
}
