package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringReplace {

	public static void main(String[] args) {
		
		Utility utility = new Utility(); 

		Scanner scanner = new Scanner(System.in);
		String template = "Hello <<UserName>>, How are you?";
		System.out.println(template);

		System.out.print("Enter your name: ");
		String username = scanner.next();

		template = utility.replaceMethod(template, "<<UserName>>", username);
		System.out.println(template);
		scanner.close();

	}

}
