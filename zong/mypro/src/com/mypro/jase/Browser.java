package com.mypro.jase;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("seting brwoser");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().setSize(new Dimension(480,800));//�����������С
		driver.manage().window().maximize();//ȫ��
		driver.get("http://m.mail.10086.cn");
		driver.quit();

	}

}
