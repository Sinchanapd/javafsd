package com.simplilearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleCheck {

	public static void main(String[] args) {
		
		String path="F:\\Phase5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		WebDriver driver=new ChromeDriver();
		
		String base_url="http://www.google.com/";
		
		String expectedTitle="Google";
		String actualTitle="";
		
		driver.get(base_url);
		
		actualTitle=driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test passes");
		}
		else
		{
			System.out.println("Test failed");
		}
	}

}
