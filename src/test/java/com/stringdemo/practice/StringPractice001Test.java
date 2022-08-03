package com.stringdemo.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class StringPractice001Test {
	@Test(testName = "validate start and end of string")
	public void startAndEnd() {
		String name="Selenium WebDriver";
		boolean start = name.startsWith("Selenium");
		boolean end = name.endsWith("Driver");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(start, true);
		Reporter.log("Tc001 pass");
		soft.assertEquals(true, end);
		Reporter.log("Tc001 fail");
		soft.assertAll();
	}

}
