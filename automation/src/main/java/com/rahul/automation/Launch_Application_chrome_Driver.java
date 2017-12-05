package com.rahul.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Application_chrome_Driver {

	public static void main(String[] args)
	{
	System.setProperty("webDriver.chrome.driver","E:\\Start journey\\GekoDriver\\chromedriver.exe");	
       WebDriver driver =new ChromeDriver();
	}

}
