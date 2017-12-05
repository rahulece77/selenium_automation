package com.rahul.automation;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hndle_CheckBox {

	public static void main(String[] arg) throws InterruptedException
			{
				
		//Opening firefox instance		
WebDriver driver = new FirefoxDriver();

//maximizing window
driver.manage().window().maximize(); 
//Giving implicit timeout of 20 seconds
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //Giving implicit timeout of 20 seconds

				driver.get("http://www.naukri.com/");


//Since there are two windows popping up, hence switching and closing the unnecessary window.
				Set<String> windows = driver.getWindowHandles();        
				Iterator<String> iter = windows.iterator();
				String parentWindow = iter.next().toString();
				String childWindow1 = iter.next().toString();        
				driver.switchTo().window(childWindow1);
				driver.close();
				String childWindow2 = iter.next().toString();        
				driver.switchTo().window(childWindow2);
				driver.close();
				driver.switchTo().window(parentWindow);

				//Hovering over "Jobs"
				Actions act = new Actions(driver);
				WebElement jobs = driver.findElement(By.xpath("//ul[@class='midSec menu']//div[.='Jobs']"));
				//WebElement jobs = driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a/div"));
				act.moveToElement(jobs).build().perform();
				Thread.sleep(5000);
				//Clicking on "Advance Search"
				WebElement Adv_search = driver.findElement(By.xpath("//ul[@class='midSec menu']/li[1]//a[.='Advanced Search']"));
				act.moveToElement(Adv_search).click().perform();
				Thread.sleep(5000);
				//Clicking on the industry dropdown
				driver.findElement(By.xpath("//div[@class='DDinputWrap']/input[contains(@placeholder,'Select the industry')]")).click();
		Thread.sleep(5000);
				//Selecting the checkbox containing text as "Accounting"
				driver.findElement(By.xpath("//ul[@class='ChkboxEnb']//a[contains(text(),'Accounting')]")).click();
				Thread.sleep(5000);
				//Selecting the checkbox containing text as 'Government' 
				driver.findElement(By.xpath("//ul[@class='ChkboxEnb']//a[contains(text(),'Government')]")).click();
				driver.close();
			}

		

	}


