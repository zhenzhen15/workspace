package com.mypro1.jase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jietu {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new FirefoxDriver();
         driver.get("http://www.baidu.com");
         try{
         File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         
			FileUtils.copyFile(srcFile, new File("d:\\screenshot.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         driver.quit();
	}

}
