package com.com.user;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TransactionHistory {
	WebDriver driver;
	@Test
	public void TransactionHistory() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\b3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		    
		    driver.get("http://localhost:4200/home");
		
		
	    Thread.sleep(5000);
	    
		
		try 
		{
			
			driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/app-root/nav/ul/li[1]/a")).click();
			System.out.println("Transaction History Displayed");
			
			  
		    driver.findElement(By.xpath("//*[@id=\"navbardrop\"]")).click();
		    driver.findElement(By.xpath("/html/body/app-root/nav/ul/li[5]/div/a[2]")).click();
		   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/form/h3")));
		   System.out.println("Signed Out");
		}
		catch(Exception e) 
		{
			System.out.println("Please have a look");
		}
		
	    Thread.sleep(5000);  
	    driver.quit();

	}
}
