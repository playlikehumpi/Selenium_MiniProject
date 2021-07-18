package com.selenium.miniproject;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Order_Confirmation {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Eclipse Workarea\\Selenium_MiniProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.navigate().to("https://www.facebook.com/");

		// driver.navigate().to(
//				"\"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation\"");

		driver.navigate().to("http://automationpractice.com/index.php");
		// WebElement Women =
		// driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		// Women.click();

		Thread.sleep(7000);

		WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));

		women.click();
		Thread.sleep(10000);

		WebElement imgClick = driver.findElement(By.xpath("(//a[@itemprop='url'])[2]"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(imgClick));
		imgClick.click();

		Thread.sleep(7000);

		WebElement Qty = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));

		WebDriverWait waitQty = new WebDriverWait(driver, 30);
		waitQty.until(ExpectedConditions.elementToBeClickable(Qty));

		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		Qty.click();

		Thread.sleep(7000);

		WebElement size = driver.findElement(By.id("group_1"));

		// WebElement size =
		// driver.findElement(By.xpath("//select[contains(@class,'form-control
		// attribute_select ')]"));
//		WebDriverWait waitS = new WebDriverWait(driver, 30);
//		waitS.until(ExpectedConditions.visibilityOf(size));

		Select Ssize = new Select(size);

		Ssize.selectByIndex(2);

		WebElement color = driver.findElement(By.xpath("//a[@title='Orange']"));
		color.click();

		WebElement addtocart = driver.findElement(By.xpath("//button[@class='exclusive']"));
		addtocart.click();

		WebElement proToCheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proToCheckout.click();

		WebElement proToCheckout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proToCheckout2.click();

		WebElement name = driver.findElement(By.name("email"));
		name.sendKeys("seltest340@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
		password.sendKeys("UISDJjk");

		WebElement signin = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		signin.click();

		WebElement checkout = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		checkout.click();

		WebElement iAgree = driver.findElement(By.xpath("(//input[@type='checkbox'])"));

		iAgree.click();

		WebElement processcarrier = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		processcarrier.click();

		WebElement paybycheck = driver.findElement(By.xpath("//a[@title='Pay by check.']"));

		paybycheck.click();
		Thread.sleep(3000);

		WebElement confirmationorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirmationorder.click();

		// To Capture Screenshot

		TakesScreenshot Ts = (TakesScreenshot) driver; // narrow casting
		File source = Ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("F:\\Eclipse Workarea\\Selenium_MiniProject\\Screenshots\\orderconfirmation.png");

		FileUtils.copyFile(source, destination);



	}

}
