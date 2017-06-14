package com.mypro.mode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baiduTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void baiduTest(String testdata) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys(testdata);
		driver.findElement(By.id("su")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
	
	public static void readTxtFile(String filePath){
		try{
			String encoding = "GBK";
			File  file = new File(filePath);
			if(file.isFile()&& file.exists()){//�ж��ļ��Ƿ����
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding);//���ǵ������ʽ
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while((lineTxt = bufferedReader.readLine())!=null){
					System.out.println(lineTxt);
                    baiduTest(lineTxt);//����baiduTest����
				}
				
				read.close();
				
			}else{
				System.out.println("�Ҳ���ָ���ļ�");
			}
		}catch(Exception e){
			System.out.println("��ȡ�ļ����ݳ���");
			e.printStackTrace();
		}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "D:\\jenny\\info.txt";//ָ�������ļ���Ŀ¼
        readTxtFile(filePath);
	}

}
