package com.mypro1.jase;

import java.util.Random;
import java.util.Scanner;

public class randomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int min =1000;
         int max=9999;
         Random rand = new Random();
         int s = rand.nextInt(max)%(max-min+1)+min;
         String ss =String.valueOf(s);
         System.out.println(ss);
         
         //�����������
         Scanner sc = new Scanner(System.in);
         
         //��ȡ�û�������ַ���
         System.out.println("�����������֤��");
         String str = sc.nextLine();
         if(str.equals(ss)){
        	 System.out.println("������ȷ");
         }else if(str.equals("98765454")){
        	 System.out.println("������ȷ");
        	 
         }
         else{
        	 System.out.println("�������");
         }
	}

}
