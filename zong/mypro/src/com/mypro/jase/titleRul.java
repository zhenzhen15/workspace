package com.mypro.jase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class titleRul {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http:www.126.com");
		
		System.out.println("Befor login======");
		
		System.out.printf("title of current page is %s\n",driver.getTitle());
		System.out.printf("url of current page is %s\n",driver.getCurrentUrl());
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='auto-id-1463390639639']")).clear();
		driver.findElement(By.xpath("//input[@id='auto-id-1463390639639']")).sendKeys("janyzhen15");
		driver.findElement(By.xpath(("/html/body/div[2]/div[2]/div[2]/form/div/div[3]/div[2]/input[2]"))).clear();
		driver.findElement(By.xpath(("/html/body/div[2]/div[2]/div[2]/form/div/div[3]/div[2]/input[2]"))).sendKeys("zong890105");
		driver.findElement(By.id("loginBtn")).click();
		//获取当前的title和URL
		System.out.printf("title of current page is %s\n",driver.getTitle());
		System.out.printf("url of current page is %s\n",driver.getCurrentUrl());
		//获取登录用户名
		String text = driver.findElement(By.id("spnUid")).getText();
		System.out.println(text);
		
		driver.quit();
		

	}

}
