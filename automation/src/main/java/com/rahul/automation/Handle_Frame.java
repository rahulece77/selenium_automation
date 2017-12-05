package com.rahul.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Handle_Frame
{
	
    public static void main (String[] args)
    {
    	WebDriver driver =new FirefoxDriver();
    	driver.get("http://the-internet.herokuapp.com/iframe");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));
        // print your number of frames
        System.out.println(iframes.size());

        // you can reach each frame on your site
        for (WebElement iframe : iframes) {

            // switch to every frame
            driver.switchTo().frame(iframe);

            // now within the frame you can navigate like you are used to
            System.out.println(driver.findElement(By.id("tinymce")).getText());
        }
		
    }
}
