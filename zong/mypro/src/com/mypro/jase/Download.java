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
		//browser.download.folderList����0�������ص������Ĭ������·�������ó�2�򱣴浽ָ��Ŀ¼
		firefoxProfile.setPreference("browser.download.folderList", 2);
		
		//�Ƿ���ʾ��ʼ��trueΪ��ʾ��flaseΪ����ʾ
		firefoxProfile.setPreference("browser.downlaod.manager.showWhenStarting", false);
		
		//����ָ�������ļ���Ŀ¼��os.getcwd() ��������Ҫ���ݲ��������ڷ��ص�ǰ��Ŀ¼��
		firefoxProfile.setPreference("browser.download.dir", "d:\\java");
		
		//ָ��Ҫ����ҳ���Content-type ֵ����application/octet-stream��Ϊ�ļ������͡�
		//HTTP Content-type ���ö��ձ�http://tool.oschina.net/commons
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream");
		WebDriver driver = new FirefoxDriver(firefoxProfile);
		
		driver.get("https://pypi.Python.org/pypi/selenium");
		driver.findElement(By.partialLinkText("selenium-2.53.2.xml")).click();

	}

}
