package com.Amazonproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonValidation {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
		
	System.setProperty("webdriver.chrome.driver", "./SourceFolder/chromedriver.exe");
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("mac lipsticks for women");
	Thread.sleep(3000);
	driver.findElement(By.className("nav-search-submit-text")).click();
	
		
	//Scrolling down to chose the product
			Actions at = new Actions(driver);
			at.sendKeys(Keys.PAGE_DOWN).build().perform();
			
			//Identify the Product & scroll down until that product
			
			WebElement web = driver.findElement(By.linkText("M-A-C PRO by Mac Little Lipstick, Matte Finish, 1.8 Grams - Mehr"));
			String strn = web.getText();
			System.out.println("Scrolled down to" +strn);
			driver.findElement(By.linkText("M-A-C PRO by Mac Little Lipstick, Matte Finish, 1.8 Grams - Mehr")).click();
			Set<String> ids = driver.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        driver.switchTo().window(childId);
	        driver.findElement(By.id("add-to-cart-button")).click();
	        driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
	        
	        
	      //Login Validation
	        
	        WebElement username = driver.findElement(By.id("ap_email"));
	        username.sendKeys("shradha.lisa@gmail.com");
	        driver.findElement(By.id("continue")).click();
	        
	        //Password
	        WebElement Password = driver.findElement(By.id("ap_password"));
	        Password.sendKeys("password");
	        driver.findElement(By.id("signInSubmit")).submit();
	        
	        

	}

}
