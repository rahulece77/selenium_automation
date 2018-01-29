package com.rahul.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApp1 {

	//public static void main(String[] args) throws InterruptedException {
	
	public static void main(String[] args) throws InterruptedException
	{
		//Launch Firefox Driver
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// it will select Day from day dropdown...
		WebElement DropDown_Day=driver.findElement(By.id("day"));
		Select DD_Day=new Select(DropDown_Day);
		Thread.sleep(3000);
	     DD_Day.selectByValue("6");	
	     WebElement Selected_Value1=DD_Day.getFirstSelectedOption();
			System.out.println("The Value of Day is :"+Selected_Value1.getText());
			// it will select month from month dropdown
	     WebElement DropDown_Month=driver.findElement(By.id("month"));
			Select DD_Month=new Select(DropDown_Month);
			DD_Month.selectByIndex(3);
			WebElement Selected_Value=DD_Month.getFirstSelectedOption();
		System.out.println("The Value Month is :"+Selected_Value.getText());
		driver.close();
			
	}

}
