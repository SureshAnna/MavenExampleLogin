package com.Hello.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginDetails {

	@Test
	public void initBrowser() {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumPractice\\Login\\src\\main\\java\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Hello");
	}

}
