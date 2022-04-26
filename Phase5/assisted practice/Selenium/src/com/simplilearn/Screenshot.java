package com.simplilearn;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path= "F:\\Phase5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		TakesScreenshot screenshot= (TakesScreenshot) driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileHandler.copy(src, new File("C://Users//HP//Pictures//Screenshots//test1.png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		driver.close();
	}

}
