package edu.training.lesson.verificationwork;

public class Solution06 {

	public static void main(String[] args) {
		int k;
		int n = 20;
		int from = -30;
		int to = 60;
		int h = (Math.abs(from) + to) / n;
		int a = 3 * (int) Math.pow(10.0, 3.0);
		int b = 6 * (int) Math.pow(10.0, 4.0);
		int m = 4;

		int t1 = (int) Math.sqrt(a + b + m);
		int t2 = m * (int) Math.sqrt(a + b);
		int t3 = (int) Math.sqrt(a * b * m);
		int t4 = m * (int) Math.sqrt(a * b);

		int result;
		int count = 0;

		System.out.println("Значения, удовлетворяющие условию: ");
		for (k = from; k <= to; k = k + h) {
			result = (int) Math.pow(k, 3) - 25 * (int) Math.pow(k, 2) + 50 * k + 1000;

			if (result >= t1 && result <= t2 || result >= t3 && result <= t4) {
				System.out.print(result + ", ");
			} else {
				count = count + 1;
			}
		}
		System.out.println("  ");
		System.out.println("Количество значений, не удовлетворяющих заданному условию = " + count);
	}
}
