package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CoinFlip {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		Integer noOfFlip;
		
		
		System.out.print("Enter number of times you want to flip the coin: ");
		noOfFlip = scanner.nextInt();
		scanner.close();
		boolean result = utility.calculatePercentageOfHeadsAndTails(noOfFlip);
		System.out.println(result);
	}

}
