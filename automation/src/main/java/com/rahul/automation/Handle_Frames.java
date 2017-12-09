package com.rahul.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_Frames {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		System.out.println("The Current URL is :"+driver.getCurrentUrl());
		List<WebElement> Total_Nodes=driver.findElements(By.tagName("iframe"));
		System.out.println("total frame no :"+ Total_Nodes.size());
		for(int i=0;i<Total_Nodes.size();i++)
		{
			WebElement NoOfFrame=Total_Nodes.get(i);
			
			
			
			String NameOfFrame=NoOfFrame.getTagName();
			System.out.println("value is :" +NameOfFrame);
               
		}
		

	} 

}
