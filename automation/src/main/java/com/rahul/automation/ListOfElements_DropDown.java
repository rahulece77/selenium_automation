package com.rahul.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class ListOfElements_DropDown 
{
	
public static void main(String[] arg)
{
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement DropDown_Day1=driver.findElement(By.id("day"));
	Select DD_Day1=new Select(DropDown_Day1);
	List<WebElement> List_Day=DD_Day1.getOptions();
	int Total_Month=List_Day.size();
	System.out.println("total day in drop down:"+Total_Month);
	for(WebElement ele:List_Day)
	{
	String Month_Name=ele.getText();
	System.out.println("total day in drop down:"+Month_Name);
	}
	
	
	
	
}


}
