package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keyboard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		WebElement input = driver.findElement(By.id(("kw")));
		
		input.sendKeys("selenium");
		
		input.sendKeys(Keys.BACK_SPACE);
		
		input.sendKeys(Keys.SPACE);
		input.sendKeys("教程");
		//ctrl+a 全选输入框内容
		input.sendKeys(Keys.CONTROL,"a");
		//ctrl+x 剪切输入框内容
		input.sendKeys(Keys.CONTROL,"x");
		//ctrl+v 粘贴内容到输入框
		input.sendKeys(Keys.CONTROL,"v");
		//通过回车键盘来代替点击操作
		input.sendKeys(Keys.ENTER);
		driver.quit();
        
        
	}

}
