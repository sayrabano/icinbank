package com.com.user;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class Login {
	WebDriver driver;
  @Test
  public void LoginTest() throws InterruptedException {
	  
	  
		 System.setProperty("webdriver.chrome.driver","E:\\b3\\chromedriver.exe");
		 driver = new ChromeDriver();
    
    driver.get("http://localhost:4200/login");
    Thread.sleep(5000);
    
    driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[2]/input")).sendKeys("sayra123");
	driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[3]/input")).sendKeys("sayra123");
	driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[4]/button")).click();
	try 
	{
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("http://localhost:4200/login")));
		System.out.println("Login Successfull");
	
	}
	catch(Exception e) 
	{
		System.out.println("Error in browser!!\nPlease have a look");
	}
	
    Thread.sleep(5000);  
    driver.quit();
  }
}