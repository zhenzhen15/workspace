package com.mypro.jase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login163 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("163 mail login");
		
		WebDriver driver = new FirefoxDriver();
		
		 driver.get("http://mail.163.com");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.findElement(By.className("j-inputtext dlemail")).clear();
		 driver.findElement(By.className("j-inputtext dlemail")).sendKeys("janyzhen15");
		 driver.findElement(By.className("j-inputtext dlpwd")).clear();
		 driver.findElement(By.className("j-inputtext dlpwd")).sendKeys("Zong890105");
		 driver.findElement(By.id("dologin")).click();
		
//		driver.get("http://www.126.com");
//		driver.findElement(By.id("auto-id-1463127447460")).clear();
//		driver.findElement(By.id("auto-id-1463127447460")).sendKeys("janyzhenz");
//		driver.findElement(By.id("auto-id-1463127447463")).clear();
//		driver.findElement(By.className("auto-id-1463127447463")).sendKeys("zong890105");
//		driver.findElement(By.id("dologin")).click();

	}

}