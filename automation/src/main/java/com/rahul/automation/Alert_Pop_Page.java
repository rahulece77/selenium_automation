package com.rahul.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Pop_Page {

	public static void main(String[] args) 
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Locator Using Xpath(.//input[@id='loginbutton'])
	//	Get the Text Value of Login Button 
	System.out.println(driver.findElement(By.xpath(".//input[@id='loginbutton']")).getText());
	driver.findElement(By.xpath(".//input[@id='loginbutton']")).click();
	
	//Handle ALert using ALert and switch to method  ...
	Alert Alt1=driver.switchTo().alert();
	
	//Taking text value from alert pop up 
	System.out.println(Alt1.getText());
	//click on Ok on alert pop up 
	Alt1.accept();
	
	//After Click on OK close the current browser which is open through driver 
driver.close();
	}

}
