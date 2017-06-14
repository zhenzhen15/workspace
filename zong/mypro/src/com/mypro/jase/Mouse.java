package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://yunpan.360.cn/");
		
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[1]/div/div[2]/form/p[5]/input"))).perform();
		System.out.println("µã»÷³É¹¦");
		
		

	}

}
