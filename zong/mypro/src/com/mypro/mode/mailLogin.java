package com.mypro.mode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mailLogin {

	/**
	 * @param args
	 */

		// TODO Auto-generated method stub
		public static void login(WebDriver driver){
			
			 driver.findElement(By.id("idInput")).clear();
			 driver.findElement(By.id("idInput")).sendKeys("janyzhen15");
			 driver.findElement(By.id("pwdInput")).clear();
			 driver.findElement(By.id("pwdInput")).sendKeys("Zong890105");
			 driver.findElement(By.id("loginBtn")).click();
			
		}
		
		public static void logout(WebDriver driver){
			
			driver.findElement(By.linkText("ÍË³ö")).click();
		}
		
		public static void main(String [] args) throws InterruptedException{
			
			System.out.println("163 mail login");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://mail.163.com");
		    login(driver);
		    Thread.sleep(5000);
		    System.out.println("login success!");
		    
		    logout(driver);
		    driver.quit();
		}

	}


