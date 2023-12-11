package edu.training.lesson.verificationwork;

import java.util.Random;

public class Solution04 {

	public static void main(String[] args) {
		int n = 5;

		// double[] x = { 2.3, 1.5, -2, -1, 0.5 };
		// double[] y = { -1.1, 3.0, 0.0, 1.2, 0.5 };

		double[] x = new double[n];
		double[] y = new double[x.length];

		Random random = new Random();

		for (int i = 0, j = 0; i < x.length; i++, j++) {
			x[i] = random.nextDouble(4.0) - 1.0;
			y[j] = random.nextDouble(4.0) - 1.0;
		}
		for (int i = 0, j = 0; i < x.length; i++, j++) {

			System.out.printf("x = %5.2f ", x[i]);
			System.out.printf("y = %5.2f ", y[j]);
			System.out.println();
		}
		System.out.println("   ");

		int count = 0;

		for (int i = 0, j = 0; i < x.length; i++, j++) {

			if (x[i] >= -2 && x[i] <= 0 && y[j] <= 2 && y[j] <= 0
					|| x[i] <= 2 && x[i] >= 0 && y[j] <= 1 && y[j] >= -1) {
				count = count + 1;
			} 
		}
		System.out.println("Количество точек, попадающих в заданную область: " + count);
	}

}
