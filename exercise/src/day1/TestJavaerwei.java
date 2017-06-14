package day1;

public class TestJavaerwei {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, sum = 0;
		int num[][] = { { 1, 3, 5 }, { 2, 4, 6 } };
		for (i = 0; i < num.length; i++) {
			for (j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+" ");
				sum += num[i][j];

			}
			System.out.println();
		}
		System.out.println("\n 总成绩是 " + sum + "分");

	}
}
