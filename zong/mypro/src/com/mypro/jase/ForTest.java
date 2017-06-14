package com.mypro.jase;

public class ForTest {
	public static void main(String [] args){
		for (int i =1;i<=5;i++){
			for (int j=5-i;j>0;j++){
				System.out.println("");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.println("*");
			}
			System.out.println("");
		}
	}

}
