package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {

	public String replaceMethod(String inputString, String replaceWord, String replaceWith) {
		return inputString.replaceAll(replaceWord, replaceWith);
	}

	public boolean calculatePercentageOfHeadsAndTails(Integer noOfFlip) {
		int head = 0, tail = 0;
		Double percentageOfHead, percentageOfTail;

		for (int i = 0; i < noOfFlip; i++) {
			if (Math.random() < 0.5)
				head++;
			else
				tail++;
		}
		percentageOfHead = ((double) head / noOfFlip) * 100;
		percentageOfTail = ((double) tail / noOfFlip) * 100;

		System.out.println("Number of Heads: " + head);
		System.out.println("Number of Tails: " + tail);
		System.out.println("Percentage of Head: " + percentageOfHead);
		System.out.println("Percentage of Tail: " + percentageOfTail);

		if ((percentageOfHead + percentageOfTail) == 100)
			return true;
		else
			return false;

	}

	public boolean checkYearLength(Integer year) {
		if ((year >= 1000) && (year < 10000))
			return true;
		else
			return false;
	}

	public String calculateLeapYear(Integer year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			return "The given year is a leap year";
		else
			return "The given year is not a leap year";
	}

	public Boolean findPowersOf2(Integer inputNumber) {

		if ((inputNumber > 31) || (inputNumber < 0))
			return false;
		else {
			int count = 1;
			for (int i = 0; i <= inputNumber; i++) {
				if (i == 0)
					System.out.println("2 ^ " + i + " = " + count);
				else {
					count = count * 2;
					System.out.println("2 ^ " + i + " = " + count);
				}
			}
			return true;
		}

	}

	public double calculateHarmonicNumber(int inputNumber) {
		if (inputNumber < 0) {
			System.out.println("You are providing the wrong input");
			return -1.0;
		} else {
			double output = 0;
			for (int i = 1; i <= inputNumber; i++)
				output = output + 1.0 / i;
			return output;
		}

	}

	public boolean calculatePrimeFactors(Integer inputNumber) {
		if (inputNumber < 0)
			return false;

		else {
			System.out.print("Prime Factors are: ");
			for (int i = 2; i * i <= inputNumber; i++) {
				while (inputNumber % i == 0) {
					System.out.print(i + " ");
					inputNumber = inputNumber / i;
				}
			}
			if (inputNumber > 1)
				System.out.println(inputNumber + " ");
			else
				System.out.println();
			return true;
		}
	}

	public boolean calculateGamblingWinPercentage(int stake, int goal, int trials) {
		int bets = 0, wins = 0;

		if ((stake <= 0) || (goal <= 0) || (goal <= stake) || (trials <= 0)) {
			return false;
		} else {
			for (int t = 0; t < trials; t++) {

				int cash = stake;
				while (cash > 0 && cash < goal) {
					bets++;
					if (Math.random() < 0.5)
						cash++;
					else
						cash--;
				}
				if (cash == goal)
					wins++;
			}

			System.out.println(wins + " wins of " + trials);
			System.out.println("Percent of games won = " + 100.0 * wins / trials);
			System.out.println("Avg # bets           = " + 1.0 * bets / trials);
			return true;
		}

	}

	public int findTriplets(int[] inputArray) {
		int count = 0;
		for (int i = 0; i < inputArray.length - 2; i++)
			for (int j = i + 1; j < inputArray.length - 1; j++)
				for (int k = j + 1; k < inputArray.length; k++)
					if (inputArray[i] + inputArray[j] + inputArray[k] == 0) {
						count++;
						System.out
								.println("Triplets are: " + inputArray[i] + " " + inputArray[j] + " " + inputArray[k]);
					}
		return count;
	}

	public char[] bubbleSort(char[] input1) {
		int n = input1.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (input1[j] > input1[j + 1]) {
					// swap temp and input1[i]
					char temp = input1[j];
					input1[j] = input1[j + 1];
					input1[j + 1] = temp;
				}

		return input1;
	}

	public Boolean checkForAnagrams(String inputString1, String inputString2) {

		// Removing Spaces and converting to LowerCase
		String input1 = inputString1.replaceAll("\\s", "").toLowerCase();
		String input2 = inputString2.replaceAll("\\s", "").toLowerCase();

		// Converting to char array
		char[] charString1 = input1.toCharArray();
		char[] charString2 = input2.toCharArray();

		// Sorting char array
		charString1 = bubbleSort(charString1);
		charString2 = bubbleSort(charString2);

		// Compare the 2 arrays
		for (int i = 0; i < charString1.length; i++)
			if (charString1[i] != charString2[i])
				return false;
		return true;
	}

	public Boolean printStockReport(Integer noOfStocks) {
		Scanner scanner = new Scanner(System.in);

		if (noOfStocks <= 0) {
			scanner.close();
			return false;
		} else {
			String[] shareNames = new String[noOfStocks];
			Integer[] totalNumberOfShares = new Integer[noOfStocks];
			Integer[] sharePrice = new Integer[noOfStocks];
			Integer[] totalValueOfStocks = new Integer[noOfStocks];

			for (int i = 0; i < noOfStocks; i++) {
				System.out.print("Enter share name: ");
				shareNames[i] = scanner.next();

				System.out.print("Enter total number of shares: ");
				totalNumberOfShares[i] = scanner.nextInt();

				System.out.print("Enter price of each share: ");
				sharePrice[i] = scanner.nextInt();

				totalValueOfStocks[i] = totalNumberOfShares[i] * sharePrice[i];
			}

			for (int i = 0; i < noOfStocks; i++) {
				System.out.println("Price Of " + shareNames[i] + " is " + totalValueOfStocks[i]);
			}
			scanner.close();
			return true;
		}
	}

}
