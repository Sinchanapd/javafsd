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
		
		
	/*	WebElement first= driver.findElement(By.name("firstname"));
		first.sendKeys("Sin");
		
		WebElement last= driver.findElement(By.name("lastname"));
		last.sendKeys("P");
		
		WebElement email= driver.findElement(By.name("reg_email__"));
		email.sendKeys("sin@gmail.com");
		
		WebElement confirm= driver.findElement(By.name("reg_email_confirmation__"));
		confirm.sendKeys("sin@gmail.com");
			
		WebElement password= driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("sinchu");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("26");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Nov");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		WebElement register= driver.findElement(By.name("websubmit"));
		register.click();
	*/
	}
}
