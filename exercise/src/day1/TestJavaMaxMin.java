package day1;

public class TestJavaMaxMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, min, i;
		int a[] = { 1, 2, 3 };
		max = min = a[0];
		for (i = 0; i < 3; i++) {
			if (a[i] > max) {
				max = a[i];
			} else {
				min = a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
