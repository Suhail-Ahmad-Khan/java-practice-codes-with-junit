package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StockAccount {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		
		Integer noOfStocks;
		
		System.out.print("Enter no. of stocks: ");
		noOfStocks = scanner.nextInt();
		
		Boolean result = utility.printStockReport(noOfStocks);
		if(result)
			System.out.println("You have the right output");
		else
			System.out.println("You might have provided the wrong data");
		
		scanner.close();	
	}

}
