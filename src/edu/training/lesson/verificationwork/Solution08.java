package edu.training.lesson.verificationwork;

public class Solution08 {

	public static void main(String[] args) {

		int n = 10;

		for (double x = 0.1; x <= n; x = x + 0.1) {

			double y = Math.pow(x, 2) - Math.pow(Math.E, 2 * x) + 4;
			if (y == 0) {
				System.out.println("Пройден ноль функции");
			} else {
				System.out.printf("%.2f \n", y);
				
			}
		}

	}

}
