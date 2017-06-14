package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Baidu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("start selenium");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("http:www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("selenium java");
		driver.findElement(By.id("su")).click();
		driver.close();
	}

}
