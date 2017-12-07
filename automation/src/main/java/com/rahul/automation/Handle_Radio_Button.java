package com.rahul.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_Radio_Button {

	public static void main(String[] args) 
	
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> RadioButtonSize=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		System.out.println("No of RadioButton On the Pagescis:"+ RadioButtonSize.size());
		
		for(int i=0;i<=RadioButtonSize.size();i++)
		{
			WebElement  RadioButton=RadioButtonSize.get(i);
			String Value=RadioButton.getAttribute("Value");
			
			System.out.println("The Value of Radio Button is......... :"+Value);
		}
		
		/// it will close all the browser 
		driver.quit();
		

	}

}
