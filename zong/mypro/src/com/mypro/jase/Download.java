package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Download {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		//browser.download.folderList设置0代表下载到浏览器默认下载路径，设置成2则保存到指定目录
		firefoxProfile.setPreference("browser.download.folderList", 2);
		
		//是否显示开始，true为显示，flase为不显示
		firefoxProfile.setPreference("browser.downlaod.manager.showWhenStarting", false);
		
		//用于指定下载文件的目录。os.getcwd() 函数不需要传递参数，用于返回当前的目录。
		firefoxProfile.setPreference("browser.download.dir", "d:\\java");
		
		//指定要下载页面的Content-type 值，“application/octet-stream”为文件的类型。
		//HTTP Content-type 常用对照表：http://tool.oschina.net/commons
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream");
		WebDriver driver = new FirefoxDriver(firefoxProfile);
		
		driver.get("https://pypi.Python.org/pypi/selenium");
		driver.findElement(By.partialLinkText("selenium-2.53.2.xml")).click();

	}

}
