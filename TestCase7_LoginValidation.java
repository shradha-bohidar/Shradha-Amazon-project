package com.Amazonproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase7_LoginValidation {

	public static void main(String[] args) throws IOException {
WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "./SourceFolder/chromedriver.exe");
		driver.get("https://www.amazon.in/Mac-Retro-Matte-Lipstick-Diva/dp/B077BC1SYY/ref=sr_1_8?crid=22N1MIEWVKBKJ&keywords=mac+lipsticks+for+women&qid=1683128763&sprefix=mac+lipsticks+for+women%2Caps%2C401&sr=8-");
		driver.manage().window().maximize();
		
		//Adding quantity of the Product
		WebElement dd = driver.findElement(By.id("quantity"));
		Select Dropdown = new Select(dd);
		Dropdown.selectByIndex(4);
		
		//Add product to the Cart
        driver.findElement(By.id("add-to-cart-button")).click();
        
        //Wait
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Proceed to Buy Items, Clicking on Proceed to Cart Button
		
        driver.findElement(By.className("a-button-input")).click();
		
        //Login Validation
        
        WebElement username = driver.findElement(By.id("ap_email"));
        username.sendKeys("shradha.lisa@gmail.com");
        driver.findElement(By.id("continue")).click();
        
        //Password
        WebElement Password = driver.findElement(By.id("ap_password"));
        Password.sendKeys("password");
        driver.findElement(By.id("signInSubmit")).submit();
        
        //TakesScreenshot scrsht = ((TakesScreenshot)driver);
        
        //File scrFile = scrsht.getScreenshotAs(OutputType.FILE);
        
        File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(Screenshot, new File("./AmazonProjectSimplilearn/ScreenShot"));
        
        //driver.close();



	}

}
