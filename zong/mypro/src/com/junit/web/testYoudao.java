package com.junit.web;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testYoudao {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.youdao.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCase() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("query")).clear();
		driver.findElement(By.id("query")).sendKeys("webdriver");
		driver.findElement(By.id("qb")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		assertEquals(title, "webdriver - ÓÐµÀËÑË÷");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}