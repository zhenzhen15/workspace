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
		
		//获得cookie
		Set<Cookie> coo = driver.manage().getCookies();
		
		//打印cookie
		System.out.println(coo);
		
		//删除所有Cookie
		//driver.manage().deleteAllCookies();
		
		driver.quit();

	}

}
