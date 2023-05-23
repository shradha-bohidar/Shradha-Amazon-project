package com.Amazonproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2_ProductTextValidation {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "./SourceFolder/chromedriver.exe");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("mac lipsticks for women");
		Thread.sleep(3000);
		driver.findElement(By.className("nav-search-submit-text")).click();
		System.out.println("Amazon opened & Searched for MAC lipstick product");
		
		String t = "mac lipsticks for women";
		if(driver.getPageSource().contains("\"mac lipsticks for women\"")) {
			System.out.println("Text:" + t + " is Present");
		}else {
			System.out.println("Text:" + t + " is not Present");
		}
		
		driver.quit();
		

	}

}
