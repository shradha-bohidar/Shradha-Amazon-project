package com.Amazonproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4_AddToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "./SourceFolder/chromedriver.exe");
		driver.get("https://www.amazon.in/Mac-Retro-Matte-Lipstick-Diva/dp/B077BC1SYY/ref=sr_1_8?crid=22N1MIEWVKBKJ&keywords=mac+lipsticks+for+women&qid=1683128763&sprefix=mac+lipsticks+for+women%2Caps%2C401&sr=8-");
		driver.manage().window().maximize();
		//Add product to the Cart
	        driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.close();
		
		
		
	}

}
