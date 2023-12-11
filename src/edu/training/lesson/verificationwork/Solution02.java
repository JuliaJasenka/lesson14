package edu.training.lesson.verificationwork;

public class Solution02 {

	public static void main(String[] args) {

		int n = 10;
		double a = 0.5;
		double b = 1.0;
		double h = (b - a) / n;
		double y;
		
		System.out.println("---------------------------------------------------------");
		System.out.printf("|    %s\t|\t %s\t|\t%5s\t\t|\n", "№ п/п", "x", "y");
		System.out.println("---------------------------------------------------------");

		for (int k = 0; k <= n; k++) {
			for (double x = 0.5; x <= b; x = x + h) {
				y = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
				k = k + 1;
				System.out.printf("|\t%d\t|\t%2.2f\t|\t%2.6f\t|\n", k, x, y);
			}
		}
		System.out.println("---------------------------------------------------------");
	}
}
