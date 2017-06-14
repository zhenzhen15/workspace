package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YouDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.youdao.com");
		
		driver.findElement(By.id("translateContent")).sendKeys("submint");
		driver.findElement(By.id("translateContent")).submit();
//		driver.findElement(By.id("query")).clear();
//		driver.findElement(By.id("query")).sendKeys("webdriver");
//		driver.findElement(By.id("qb")).click();
		
		driver.quit();

	}

}
