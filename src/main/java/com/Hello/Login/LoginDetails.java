package com.Hello.Login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LoginDetails {

	@Test
	public void initBrowser() {

		/*WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suresh\\git\\MavenExampleLogin\\src\\main\\java\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Hello");*/
		
		
	/*	
		public class Login {

			public static void main(String[] args) {*/

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh\\git\\MavenExampleLogin\\src\\main\\java\\drivers\\chromedriver.exe");
		 WebDriver driver;
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 //driver.get("www.flipkart.com");
		 driver.navigate().to("https://www.flipkart.com");
		 String Actualtitle=driver.getTitle();
		 System.out.println("FileKart Title is"+Actualtitle);
		 
		 String ExpectedTitle="FileKart Title isOnline Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More";
		 if(Actualtitle.equals(ExpectedTitle)){
			 System.out.println("Validated the flipkart login page title Actual and expected are equal");
			 
		 }
		 else{
			 System.out.println("Validated the flipkart login page title Actual and expected are notequal");
		 }
		 
		 
		 driver.findElement(By.className("_2zrpKA")).sendKeys("8500854225");
		 driver.findElement(By.xpath("//div/input[@class='_2zrpKA _3v41xv']")).sendKeys("flipkart@225");
		 driver.findElement(By.xpath("//div/button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 /*
		*/
		 
		 List<WebElement> slides=driver.findElements(By.className("_2tnqd0"));
		
		
		
		
	}

}
