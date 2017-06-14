package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JS {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(700, 600));
		driver.get("http://www.baidu.com");
		
		driver.findElement(By.id("kw")).sendKeys("webdriver api");
		driver.findElement(By.id("su")).click();
		Thread.sleep(5000);
		//将页面滚动条拖到底部
		((JavascriptExecutor)driver).executeScript("window.scrollTo(300,450);");
		Thread.sleep(5000);
		
		System.out.println("end");
		
		driver.quit();
		

	}

}
