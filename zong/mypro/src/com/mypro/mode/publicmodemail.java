package com.mypro.mode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class publicmodemail {

	/**
	 * @param args
	 */
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

}
