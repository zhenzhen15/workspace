package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClinkAndHold {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		
		//�����ͣ
		Actions action = new Actions(driver);
		//action.clickAndHold(driver.findElement(By.linkText("����"))).perform();
		
		// ���˫��
		
		action.doubleClick(driver.findElement(By.linkText("��ͼ"))).perform();
		// �����ק��������source Ԫ���Ϸŵ�target Ԫ�ص�λ�á�
//		WebElement source = driver.findElement(By.name("element"));
//		WebElement target = driver.findElement(By.name("element"));
//		action.dragAndDrop(source,target).perform();
	}

}
