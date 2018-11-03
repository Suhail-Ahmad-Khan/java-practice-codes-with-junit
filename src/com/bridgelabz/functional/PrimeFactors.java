package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeFactors {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		Integer inputNumber = scanner.nextInt();
		
		boolean output = utility.calculatePrimeFactors(inputNumber);
		if (output)
			System.out.println("You got the correct output");
		else
			System.out.println("You provided the wrong input");
		scanner.close();
	}

}
