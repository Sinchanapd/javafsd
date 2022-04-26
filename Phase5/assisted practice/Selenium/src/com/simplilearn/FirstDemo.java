package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
	
	public static void main(String []args)
	{
		String path="F:\\Phase5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		WebDriver driver=new ChromeDriver();
		
		String base_url="http://www.google.com/";
		
		driver.get(base_url);
		
		//driver.close();
		;
	}
}
