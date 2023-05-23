package com.Amazonproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase5_SelectOptionFromDropdown {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "./SourceFolder/chromedriver.exe");
		driver.get("https://www.amazon.in/Mac-Retro-Matte-Lipstick-Diva/dp/B077BC1SYY/ref=sr_1_8?crid=22N1MIEWVKBKJ&keywords=mac+lipsticks+for+women&qid=1683128763&sprefix=mac+lipsticks+for+women%2Caps%2C401&sr=8-");
		driver.manage().window().maximize();
		
		//Adding quantity of the Product
		WebElement dd = driver.findElement(By.id("quantity"));
		Select Dropdown = new Select(dd);
		Dropdown.selectByIndex(5);
		
		driver.close();
		
	}

}
