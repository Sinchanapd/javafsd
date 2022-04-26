package com.simplilearn;
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
		String base_url= "https://www.facebook.com/r.php?locale=en_GB&display=page";
		driver.get(base_url);
		
		WebElement first= driver.findElement(By.name("firstname"));
		first.sendKeys("Sin");
		//first.getAttribute("placeholder");
		//System.out.println(first.getAttribute("placeholder"));
		
		WebElement last= driver.findElement(By.name("lastname"));
		last.sendKeys("P");
		//last.getAttribute("placeholder");		
		//System.out.println(last.getAttribute("placeholder"));
		
		WebElement email= driver.findElement(By.name("reg_email__"));
		email.sendKeys("sin@gmail.com");
		//email.getAttribute("placeholder");		
		//System.out.println(email.getAttribute("placeholder"));
		
		WebElement confirm= driver.findElement(By.name("reg_email_confirmation__"));
		confirm.sendKeys("sin@gmail.com");
		
		
		WebElement password= driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("sinchu");
		//password.getAttribute("placeholder");		
		//System.out.println(password.getAttribute("placeholder"));
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("26");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Nov");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1997");
		
		
		//WebElement month= driver.findElement(By.id("month"));
		//month.getAttribute("placeholder");		
		//System.out.println(month.getAttribute("placeholder"));
		
		//WebElement year= driver.findElement(By.id("year"));
		//year.getAttribute("placeholder");		
		//System.out.println(year.getAttribute("placeholder"));
		
		//driver.findElement(By.id("u_0_6_fg")).click();
		
		//driver.findElement(By.className("_58mt")).click();
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		//WebElement radio1 = driver.findElement(By.id("u_0_6_fg"));
		//radio1.click();
		
		//WebElement radio2 = driver.findElement(By.id("u_0_7_U8"));
		//radio2.click();
		
	//	WebElement radio2 = driver.findElement(By.id("u_0_7_yD"));
		//WebElement radio3 = driver.findElement(By.id("u_0_8_dF"));
		
		
		 
		//WebElement login= driver.findElement(By.className("action-primary"));
		WebElement register= driver.findElement(By.className("websubmit"));
		register.click();
	}

}
