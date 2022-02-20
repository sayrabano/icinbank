package com.com.user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Register {
	WebDriver driver;
	@Test
	public void register() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\b3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    
	    driver.get("http://localhost:4200");
	    Thread.sleep(5000);
	    
	    try {
	    	//WebDriverWait wait=new WebDriverWait(driver, 14);
	    	driver.findElement(By.xpath("/html/body/app-root/app-login/nav/ul/li/a")).click();
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[1]/input")).sendKeys("Sana");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[2]/input")).sendKeys("khan");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[3]/input")).sendKeys("affan");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[4]/input")).sendKeys("123466y");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[5]/input")).sendKeys("17/08/2020");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[6]/input")).sendKeys("76854389");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[7]/input")).sendKeys("Delhi");
	    	Select id=new Select(driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[8]/select")));
	    	id.selectByIndex(2);
	    	WebElement fileInput = driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[9]/input"));
	    	fileInput.sendKeys("1234569");
	    	
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[10]/input")).sendKeys("abc@gmail.com");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[11]/button[1]")).click();
	    	Thread.sleep(5000);
	    	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/form/h3")));
	    	System.out.println("Registration Successfull");
	    }
	    catch(Exception e) {
	    	System.out.println("Erro in web browser\nPlease have a look");
	    }
	    Thread.sleep(5000);  
	    driver.quit();
	}
}
