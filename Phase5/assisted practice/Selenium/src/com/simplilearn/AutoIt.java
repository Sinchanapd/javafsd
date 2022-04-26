package com.simplilearn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) throws IOException,InterruptedException {
		
		String path= "F:\\Phase5\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.shine.com/registration/");
        
        WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("nikunj@gmail.com");
		
		WebElement name =driver.findElement(By.id("id_name"));
		name.sendKeys("nikunj soni");
		
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9876543210");
		
		
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Nikunj@123");

        WebElement element=driver.findElement(By.id("id_file"));
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("argument[0].click()", element);
		
		Thread.sleep(5000);
		Runtime.getRuntime().exec("F:\\resume\\upload.exe");
	}

}
