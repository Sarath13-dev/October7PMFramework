package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunc {

	public static void main(String[] args) {
		
		//Set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\SeleniumPracticeNovember6PM\\driver\\chromedriver.exe");
		
		//create object for WebDriver Interface
		WebDriver driver = new ChromeDriver();
		
		//to launch url
		driver.get("https://www.facebook.com/");
		
		//to identify the webelement
		 WebElement txtUsername = driver.findElement(By.id("email"));
		
		//to pass the input text
		txtUsername.sendKeys("ramsss");
		
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		
		txtPassword.sendKeys("12345");
		System.out.println("work done in A");
		System.out.println("i am tester");
		System.out.println("Work by B");
		System.out.println("pls accept");



		
	}
	
	
}
