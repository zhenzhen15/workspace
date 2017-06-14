package com.mypro.jase;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieOpe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.youdao.com");
		
		//ªÒµ√cookie
		Set<Cookie> coo = driver.manage().getCookies();
		
		//¥Ú”°cookie
		System.out.println(coo);
		
		driver.quit();

	}

}
