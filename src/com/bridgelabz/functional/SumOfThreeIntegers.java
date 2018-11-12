package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SumOfThreeIntegers {

	public static void main(String[] args) {

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int sizeOfArray = scanner.nextInt();
		int[] inputArray = new int[sizeOfArray];

		for (int i = 0; i < sizeOfArray; i++) {
			System.out.print("Enter element " + i + ": ");
			inputArray[i] = scanner.nextInt();
		}

		int count = utility.findTriplets(inputArray);
		if (count == 0)
			System.out.println("Sorry, There are no triplets in your provided array");
		else
			System.out.println("Total no. of triplets in the array are: " + count);
		scanner.close();
	}

}
