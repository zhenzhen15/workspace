package day1;

import java.util.Arrays;

public class TestJavaSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 4, 6, 2, 8, 5 };
		System.out.println("��������ǰ��˳��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		Arrays.sort(a);
		System.out.println("\n����������˳��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
