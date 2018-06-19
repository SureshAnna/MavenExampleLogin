package com.Hello.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LoginDetails {

	@Test
	public void initBrowser() {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"D:\\SeleniumPractice\\Login\\src\\main\\java\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Hello");
	}

}
