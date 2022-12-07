package com.qa;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

	WebDriver driver;

	@Test
	void verifyPageTitle() {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		assertEquals(driver.getTitle(), "Google");
		driver.quit();
	}

}
