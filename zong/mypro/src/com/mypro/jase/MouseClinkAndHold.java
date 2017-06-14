package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClinkAndHold {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		
		//鼠标悬停
		Actions action = new Actions(driver);
		//action.clickAndHold(driver.findElement(By.linkText("设置"))).perform();
		
		// 鼠标双击
		
		action.doubleClick(driver.findElement(By.linkText("地图"))).perform();
		// 鼠标拖拽动作，将source 元素拖放到target 元素的位置。
//		WebElement source = driver.findElement(By.name("element"));
//		WebElement target = driver.findElement(By.name("element"));
//		action.dragAndDrop(source,target).perform();
	}

}
