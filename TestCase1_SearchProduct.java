package com.Amazonproject;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestCase1_SearchProduct {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "./SourceFolder/chromedriver.exe");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("mac lipsticks for women");
		Thread.sleep(3000);
		driver.findElement(By.className("nav-search-submit-text")).click();
		System.out.println("Amazon opened & Searched for MAC lipstick product");
		
		driver.quit();
		
		
		}

}
