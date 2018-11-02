package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		String result = null;
		System.out.print("Enter Year: ");
		Integer year = scanner.nextInt();
		if (utility.checkYearLength(year)) {
			result = utility.calculateLeapYear(year);
			System.out.println(result);

		} else
			System.out.println("Please insert value of year greater than 1000");

		scanner.close();
	}

}
