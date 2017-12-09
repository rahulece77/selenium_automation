package com.rahul.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_Dynamic_Xpath {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//input[@id='uh-search-box']")).sendKeys("ORACLE");
		
		List<WebElement> Elements=driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_15127')]/span"));
		System.out.println(Elements.size());
		
		for(int i=0;i<=Elements.size();i++)
		{
			WebElement Value1=Elements.get(i);
			//String Value2=Value1.getAttribute("Value2");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			String Value2=Value1.getText();
			
			
			System.out.println("The Total  no of Value present in node  is......... :"+Value2);
			// clicking on proper value from store value
			if(Value2.equalsIgnoreCase("oracle octopus"))
			{
				Value1.click();
			}
		}

	}

}
