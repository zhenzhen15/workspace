package com.mypro1.jase;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieExa {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver dr = new FirefoxDriver();
		
		String url = "http://www.baidu.com";
		System.out.printf("now access %s \n",url);
		dr.get(url);
		
		Thread.sleep(2000);
		System.out.println(dr.manage().getCookies());
		dr.manage().deleteAllCookies();
		Cookie c1 = new Cookie("BAIDUID","xxxxxxxxxx");
		Cookie c2 = new Cookie("BDUSS","xxxxxxxxxx");
		dr.manage().addCookie(c1);
		dr.manage().addCookie(c2);
		System.out.println("browser will be close");
		dr.quit();
		

	}

}
