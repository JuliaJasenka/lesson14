package edu.training.lesson.verificationwork;

public class Solution07 {

	public static void main(String[] args) {
		int n = 7;
		int m = 7;
		double x1 = 4.0;
		double xh = 1;
		double z1 = 5.0;
		double zh = 1;

		double y;

		System.out.println("--------------------------------------------------");
		System.out.printf("|\t%2s\t|\t%2s\t|\t%2s\t|\n", "x", "z", "y");
		System.out.println("--------------------------------------------------");

		for (double x = x1; x <= n; x = x + xh) {
			for (double z = z1; z <= m; z = z + zh) {
				
				double powValueX = Math.pow(x, 2);
				double powValueZ = Math.pow(z, 2);
				double logZ = Math.log(z);
				
				y = Math.sqrt(powValueZ + powValueX) * logZ + Math.abs(logZ) / Math.sqrt(powValueX - powValueZ + 3.2);

				System.out.printf("|\t%2.2f\t|\t%2.2f\t|\t%2.2f\t|\n", x, z, y);
			}
		}
		System.out.println("-------------------------------------------------");
	}

}
