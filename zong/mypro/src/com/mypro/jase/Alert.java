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
       
       //�����ͣ�ࡰ���á�����
       Actions action = new Actions(driver);
       action.click(driver.findElement(By.linkText("����"))).perform();
       //((Actions) driver).release(driver.findElement(By.linkText("����"))).perform();
       Thread.sleep(3000);
       //����������
       driver.findElement(By.className("setpref")).click();
      
		Thread.sleep(5000);
       
       
       //��������
      // driver.findElement(By.className("prefpanelgo")).click();
		driver.findElement(By.linkText("��������")).click();
       Thread.sleep(5000);
       
       //���յ���
       driver.switchTo().alert().accept();
       
       driver.quit();
	}

}
