package edu.training.lesson.verificationwork;

public class Solution01 {

	public static void main(String[] args) {
		double x = 0.5;

		double powValue = 2.2 * x;
		double value = Math.pow(Math.E, powValue);
		double fraction = (Math.PI * x) / (x + 2.0 / 3.0);

		double value1 = Math.sqrt(value);
		double value2 = Math.abs(Math.sin(fraction));

		double result = value1 - value2 + 1.7;

		System.out.printf("При х = " + x + " , результат вычисления "+"%.5f ", result); // проверка 2.45833
	}

}
