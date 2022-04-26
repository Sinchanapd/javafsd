package com.simplilearn;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		
	String path= "F:\\Phase5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",path);
		
	WebDriver driver= new ChromeDriver();
	String base_url= "https://www.shine.com/registration/";
	driver.get(base_url);
        
        WebElement name= driver.findElement(By.id("id_name"));
        name.sendKeys("Sinchana");
        
        WebElement email= driver.findElement(By.id("id_email"));
        email.sendKeys("sinchana123@gmail.com");
        
        WebElement pass= driver.findElement(By.id("id_password"));
        pass.sendKeys("Sinchana@1234");
        
        WebElement mobile= driver.findElement(By.id("id_cell_phone"));
        mobile.sendKeys("7632432171");
        
        WebElement check= driver.findElement(By.id("id_privacy"));
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        WebElement button= driver.findElement(By.id("registerButton"));
        button.click();
     }
}
