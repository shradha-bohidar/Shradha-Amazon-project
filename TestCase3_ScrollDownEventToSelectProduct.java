package com.Amazonproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase3_ScrollDownEventToSelectProduct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "./SourceFolder/chromedriver.exe");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("mac lipsticks for women");
		Thread.sleep(3000);
		driver.findElement(By.className("nav-search-submit-text")).click();
		System.out.println("Amazon opened & Searched for MAC lipstick product");
		
		//Scrolling down to chose the product
		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//Identify the Product & scroll down until that product
		
		WebElement web = driver.findElement(By.linkText("Mac Retro Matte Lipstick Diva, 3g"));
		String strn = web.getText();
		System.out.println("Scrolled down to" +strn);
		driver.findElement(By.linkText("Mac Retro Matte Lipstick Diva, 3g")).click();
		
		driver.close();
	}

}
