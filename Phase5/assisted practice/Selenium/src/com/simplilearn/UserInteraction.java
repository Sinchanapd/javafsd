package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path= "F:\\Phase5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		WebDriver driver= new ChromeDriver();
		
		String base_url="http://www.facebook.com/";
		
		driver.get(base_url);
		
		WebElement username=driver.findElement(By.id("email"));
		
		Actions builder=new Actions(driver);
		Action seriesofAction=builder
				.moveToElement(username)
				.click()
				.keyDown(username,Keys.SHIFT)
				.sendKeys(username,"hello")
				.doubleClick(username)
				.contextClick()
				.build();
		
		seriesofAction.perform();
				
				
	}

}
