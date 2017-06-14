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
			ArrayList<String []> csvList = new ArrayList<String []>();//������������
			CsvReader reader = new CsvReader(filePath,',',Charset.forName("SJIS"));//һ�����������Ϳ�����
			 reader.readHeaders();// ������ͷ�����Ҫ��ͷ�Ļ�����Ҫд��䡣
			 while (reader.readRecord()){//���ж������ͷ������
				 csvList.add(reader.getValues());
			 }
			 reader.close();
			 
			 for(int row =0;row<csvList.size();row++){
				 System.out.println(csvList.get(row)[0]);//name
				 System.out.println(csvList.get(row)[1]);//email
				 System.out.println(csvList.get(row)[2]);//age
				 System.out.println(csvList.get(row)[3]);//sex
				 System.out.println("---------------");//�ָ���
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
