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
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suresh\\git\\MavenExampleLogin\\src\\main\\java\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Hello");
	}

}
