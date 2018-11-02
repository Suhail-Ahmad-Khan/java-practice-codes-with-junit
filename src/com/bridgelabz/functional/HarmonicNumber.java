package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your number: ");
		int inputNumber = scanner.nextInt();
		double output = utility.calculateHarmonicNumber(inputNumber);
		if (output == -1.0)
			System.out.println("Please input values greater than 0");
		else
			System.out.println("Harmonic value of " + inputNumber + " is " + output);
		scanner.close();
	}

}
