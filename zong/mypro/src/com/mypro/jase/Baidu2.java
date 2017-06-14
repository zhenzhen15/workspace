package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baidu2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver = new FirefoxDriver();
          driver.get("http://www.baidu.com");
          
          //��ȡ�ٶ������ĳߴ�
          WebElement size = driver.findElement(By.id("kw"));
          System.out.println(size.getSize());
          
          //���ذٶ�ҳ��ײ�������Ϣ
          WebElement text = driver.findElement(By.id("cp"));
          System.out.println(text.getText());
          
          //����Ԫ�ص�����ֵ��������id,name,type��Ԫ��ӵ�е�������������
          
          WebElement ty = driver.findElement(By.id("kw"));
          System.out.println(ty.getAttribute("type"));
          
          //����Ԫ�صĽ���Ƿ�ɼ������ؽ��ΪTrue ��False
          WebElement display = driver.findElement(By.id("kw"));
          System.out.println(display.isDisplayed());
          
          driver.quit();
	}

}
