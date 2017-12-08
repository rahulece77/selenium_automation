package com.rahul.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_FaceBook_Registration_Radio_Button {

	public static void main(String[] args) 
	
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		System.out.println(" URL IS :"+driver.getCurrentUrl());
		List <WebElement> FBRButton=driver.findElements(By.xpath("//input[@name='sex' and @type='radio']"));
		
		System.out.println("The no Radio Button on FB registration page :" +FBRButton.size());
		for(int i=0;i<=FBRButton.size();i++)
		{
			WebElement Value=FBRButton.get(i);
			String ButtonName=Value.getAttribute("Value");
			System.out.println("The Button name on FB page is : " +ButtonName );
			
			if(ButtonName.equalsIgnoreCase("2"))
			{
		              Value.click();
		              System.out.println("Button is selected or not :" + Value.isSelected());
			}
		}
driver.close();
	}

}
