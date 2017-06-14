package com.mypro.jase;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.baidu.com");
		 //��ȡ��ǰ���ھ��
		 String sreach_handle = driver.getWindowHandle();
		 
		 //�򿪰ٶ�ע�ᴰ��
		 System.out.println(sreach_handle);
		 driver.findElement(By.linkText("��¼")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("����ע��")).click();
		 
		 //��ȡ���Դ��ھ��
		 
		 Set<String> handles = driver.getWindowHandles();
		 
		 //�ж��Ƿ�Ϊע�ᴰ�ڣ�������ע�ᴰ���ϵ�Ԫ��
		 
		 for(String handle : handles){
			 if(handle.equals(sreach_handle)==false){
				 //�л���ע��ҳ��
				 
				 driver.switchTo().window(handle);
				 System.out.println("now register window!");
				 Thread.sleep(2000);
				 driver.findElement(By.name("phone")).clear();
				 driver.findElement(By.name("phone")).sendKeys("userName");
				 driver.findElement(By.name("password")).sendKeys("password");
				 Thread.sleep(2000);
				 
				 //�رյ�ǰ����
				 driver.close();
				 
			 }
			 
		
		 }
		 
		 //�ж��Ƿ�Ϊ�ٶ���ҳ����������ҳ�ϵ�Ԫ��
		 
		 for(String handle : handles){
			 if(handle.equals(sreach_handle)){
				 //�л���ע��ҳ��
				 driver.switchTo().window(handle);
				 Thread.sleep(2000);
				 driver.findElement(By.className("close-btn")).click();
				 System.out.println("now baidu sreach page!");
				 driver.findElement(By.id("kw")).sendKeys(("webdriver"));
				 driver.findElement(By.id("su")).click();
				 Thread.sleep(2000);
			 }
			 
			 driver.quit();
			 
		 }
		 
		 
		 
		 
	}

}
