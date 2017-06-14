package com.mypro.jase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class timeout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//页面加载超时时间设置为5s
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.get("http://www.baidu.com");
		//定位对象时给10s 的时间, 如果10s 内还定位不到则抛出异常
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("kw33")).sendKeys("selenium");
		//异步脚本的超时时间设置成3s
		driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
		
		driver.quit();
		
		

	}

}
