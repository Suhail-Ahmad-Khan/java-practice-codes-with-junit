package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		
		String inputString1;
		String inputString2;
		System.out.print("Enter input string 1: ");
		inputString1 =  scanner.nextLine();
		System.out.print("Enter input string 2: ");
		inputString2 = scanner.nextLine();
		
		Boolean output = utility.checkForAnagrams(inputString1, inputString2);
		if (output)
			System.out.println("Given Strings are Anagrams");
		else
			System.out.println("Given Strings are not Anagrams");
		
		scanner.close();
		
	}

}
