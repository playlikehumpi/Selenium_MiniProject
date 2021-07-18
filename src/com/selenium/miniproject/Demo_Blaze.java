package com.selenium.miniproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Blaze {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Eclipse Workarea\\Selenium_MiniProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.demoblaze.com/index.html");
		
		Thread.sleep(10000);
		
		WebElement imgCLick = driver.findElement(By.xpath("(//a[@class='hrefch'])[1]"));
		imgCLick.click();
		
		Thread.sleep(2000);
		
		WebElement addtoCart = driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']"));
		
		addtoCart.click();
		
		Thread.sleep(2000);
	    Alert sAlert = driver.switchTo().alert();
		sAlert.accept();
	        
  
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("(//a[@class='nav-link'])[4]"));
		cart.click();
		
		Thread.sleep(3000);
		
		WebElement order = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		order.click();
		
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("(//input[@class='form-control'])[5]"));
		name.sendKeys("Test");
		
		
		
		WebElement country = driver.findElement(By.xpath("(//input[@class='form-control'])[6]"));
		country.sendKeys("India");
		
		WebElement city = driver.findElement(By.xpath("(//input[@class='form-control'])[7]"));
		city.sendKeys("Chennai");
		
		WebElement creditcard = driver.findElement(By.xpath("(//input[@class='form-control'])[8]"));
		creditcard.sendKeys("4567812151");
		
		WebElement month = driver.findElement(By.xpath("(//input[@class='form-control'])[9]"));
		month.sendKeys("June");
		
		WebElement year = driver.findElement(By.xpath("(//input[@class='form-control'])[10]"));
		year.sendKeys("2021");
		
		WebElement purchase = driver.findElement(By.xpath("(//button[@type='button'])[9]"));
		
		purchase.click();
		
		
		// To Capture Screenshot
		
	   TakesScreenshot Ts = (TakesScreenshot) driver; // narrow casting
	   File source = Ts.getScreenshotAs(OutputType.FILE);

	   File destination = new File("F:\\Eclipse Workarea\\Selenium_MiniProject\\Screenshots\\demoblaze.png");

	   FileUtils.copyFile(source, destination);

		
		
		
		
		
		
		
		
	}

}
