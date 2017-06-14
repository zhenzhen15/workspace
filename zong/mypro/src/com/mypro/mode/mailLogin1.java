package com.mypro.mode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mailLogin1 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("163 mail login");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mail.163.com");
		publicmodemail.login(driver);
		Thread.sleep(5000);
		System.out.println("login successs!");
		publicmodemail.logout(driver);
		driver.quit();

	}

}
