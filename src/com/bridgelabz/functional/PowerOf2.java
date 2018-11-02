package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		Boolean output;

		System.out.println("Enter the number: ");
		Integer inputNumber = scanner.nextInt();

			output = utility.findPowersOf2(inputNumber);

		if (output)
			System.out.println("You have your output");
		else
			System.out.println("Please input values between 0 and 31");
		
		scanner.close();

	}

}
