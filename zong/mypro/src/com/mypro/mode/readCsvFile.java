package com.mypro.mode;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;

public class readCsvFile {

	/**
	 * @param args
	 */
	public static void readCsvFile(String filePath){
		
		try {
			ArrayList<String []> csvList = new ArrayList<String []>();//用来保存数据
			CsvReader reader = new CsvReader(filePath,',',Charset.forName("SJIS"));//一般用这编码读就可以了
			 reader.readHeaders();// 跳过表头如果需要表头的话，不要写这句。
			 while (reader.readRecord()){//逐行读入除表头的数据
				 csvList.add(reader.getValues());
			 }
			 reader.close();
			 
			 for(int row =0;row<csvList.size();row++){
				 System.out.println(csvList.get(row)[0]);//name
				 System.out.println(csvList.get(row)[1]);//email
				 System.out.println(csvList.get(row)[2]);//age
				 System.out.println(csvList.get(row)[3]);//sex
				 System.out.println("---------------");//分割线
			 }
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "D:\\jenny\\userinfo.csv";
		readCsvFile(filePath);

	}

}
