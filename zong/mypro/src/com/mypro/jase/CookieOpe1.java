package com.mypro.jase;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieOpe1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.youdao.com");
		
		Cookie c1 = new Cookie("name","key-aaaaaaa");
		Cookie c2 = new Cookie("value","value-bbbbbb");
		
		driver.manage().addCookie(c1);
		driver.manage().addCookie(c2);
		
		//���cookie
		Set<Cookie> coo = driver.manage().getCookies();
		
		//��ӡcookie
		System.out.println(coo);
		
		//ɾ������Cookie
		//driver.manage().deleteAllCookies();
		
		driver.quit();

	}

}
