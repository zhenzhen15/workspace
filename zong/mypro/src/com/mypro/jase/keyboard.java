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
		input.sendKeys("�̳�");
		//ctrl+a ȫѡ���������
		input.sendKeys(Keys.CONTROL,"a");
		//ctrl+x �������������
		input.sendKeys(Keys.CONTROL,"x");
		//ctrl+v ճ�����ݵ������
		input.sendKeys(Keys.CONTROL,"v");
		//ͨ���س�����������������
		input.sendKeys(Keys.ENTER);
		driver.quit();
        
        
	}

}
