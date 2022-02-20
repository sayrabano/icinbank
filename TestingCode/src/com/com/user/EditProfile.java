package com.com.user;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EditProfile {
	WebDriver driver;
	@Test
	public void EditPorfile() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\b3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		  
		  driver.get("http://localhost:4200/home");
		 
		
	
		 
	    Thread.sleep(5000);
	    
	    try 
		{
			
			
			driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);   
		    driver.findElement(By.xpath("//*[@id=\"dropdown04\"]")).click();
		    driver.findElement(By.xpath("/html/body/app-root/nav/div/ul/li[5]/div/a[1]")).click();
		    driver.findElement(By.xpath("/html/body/app-root/app-edit-profile/div[1]/form/div/div[1]/input")).sendKeys("123456789");
		    
		    driver.findElement(By.xpath("/html/body/app-root/app-edit-profile/div[1]/form/div/div[2]/input")).sendKeys("Mumbai");
		    driver.findElement(By.xpath("/html/body/app-root/app-edit-profile/div[1]/form/div/div[2]/div[1]/input")).sendKeys("say@gmail.com");
		    driver.findElement(By.xpath("/html/body/app-root/app-edit-profile/div[1]/form/div/div[2]/div[2]/input")).sendKeys("sayra123");
		    driver.findElement(By.xpath("/html/body/app-root/app-edit-profile/div[1]/form/div/div[2]/div[3]/input")).sendKeys("abc");
		    
		    //driver.findElement(By.xpath("/html/body/app-root/app-edit-profile/div[1]/form/div/div[3]/button")).click();
		    System.out.println("Profile edited");
		    driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);   
		    driver.findElement(By.xpath("//*[@id=\"dropdown04\"]")).click();
		    driver.findElement(By.xpath("/html/body/app-root/nav/div/ul/li[5]/div/a[2]")).click();
		    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/form/h3")));
		    System.out.println("Signed Out");
		}
		catch(Exception e) 
		{
			System.out.println("Error in browser!!\nPlease have a look");
		}
		
	    Thread.sleep(5000);  
	   

	}

}
