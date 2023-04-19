package stepDefinitions;

public class Test {

	public static void main(String[] args) {
		//find largest of 3 numbers && means AND operator
		int a = 110;
		int b = 20;
		int c = 30;

		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > c) {
			System.out.println(b);
		} else {

			System.out.println(c);

		}
	}
}
