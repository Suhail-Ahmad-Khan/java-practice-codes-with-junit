package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		int stake, goal, trials;

		System.out.print("Enter your cash amount: ");
		stake = scanner.nextInt();

		System.out.print("Enter your goal amount: ");
		goal = scanner.nextInt();

		System.out.print("Enter number of times you wish to play: ");
		trials = scanner.nextInt();

		boolean result = utility.calculateGamblingWinPercentage(stake, goal, trials);
		if(result)
			System.out.println("Congrats you got the correct output");
		else
			System.out.println("You might have given some wrong input");
		scanner.close();

	}

}
