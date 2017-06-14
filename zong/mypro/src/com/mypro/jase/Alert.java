package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       WebDriver driver = new FirefoxDriver();
       driver.get("http://www.baidu.com");
       
       //鼠标悬停相“设置”链接
       Actions action = new Actions(driver);
       action.click(driver.findElement(By.linkText("设置"))).perform();
       //((Actions) driver).release(driver.findElement(By.linkText("设置"))).perform();
       Thread.sleep(3000);
       //打开搜索设置
       driver.findElement(By.className("setpref")).click();
      
		Thread.sleep(5000);
       
       
       //保存设置
      // driver.findElement(By.className("prefpanelgo")).click();
		driver.findElement(By.linkText("保存设置")).click();
       Thread.sleep(5000);
       
       //接收弹窗
       driver.switchTo().alert().accept();
       
       driver.quit();
	}

}
