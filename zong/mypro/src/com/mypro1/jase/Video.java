package com.mypro1.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        driver.get("http://videojs.com");
        WebElement video = driver.findElement(By.xpath("//body/section/div/video"));
        
        JavascriptExecutor jse =(JavascriptExecutor)driver;
        
        //获得视屏的URL
        jse.executeScript("return arguments[0].currentSrc", video);
        
        
        //播放视屏，播放15秒钟
        jse.executeScript("return arguments[0].play", video);
        Thread.sleep(15000);
        
        //暂停视屏
        jse.executeScript("arguments[0].pause()", video);
        
        driver.quit();
	}

}
