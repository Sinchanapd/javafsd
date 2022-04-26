package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginById {

	public static void main(String[] args) {
		
		String path="F:\\Phase5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		WebDriver driver=new ChromeDriver();
		
		String base_url="http://www.facebook.com/";
		
		driver.get(base_url);
		

        WebElement email= driver.findElement(By.id("email"));
        email.getAttribute("placeholder");
        
        System.out.println(email.getAttribute("placeholder"));
        
        WebElement password= driver.findElement(By.id("pass"));
        password.getAttribute("placeholder");
        
        System.out.println(password.getAttribute("placeholder"));
        
        email.sendKeys("nikunj@gmail.com");
         
        password.sendKeys("nikunj@123");
         
        WebElement login= driver.findElement(By.name("login"));

	}

}
