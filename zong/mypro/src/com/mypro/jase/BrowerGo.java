package com.mypro.jase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowerGo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("broser back and forward");
		WebDriver driver = new FirefoxDriver();
		String firstUrl ="http://www.baidu.com";
		System.out.printf("now accessss %s \n",firstUrl);
		driver.get(firstUrl);
		
		String secondUrl = "http://news.baidu.com";
		System.out.printf("now accessss %s \n",secondUrl);
		driver.get(secondUrl);
		
		System.out.printf("now back to %s \n",firstUrl);
		driver.navigate().back();
		
		//driver.navigate().refresh(); Ë¢ÐÂÒ³Ãæ
		
		System.out.printf("forward to %s \n",secondUrl);
		driver.navigate().forward();
		
		driver.quit();
	}

}
