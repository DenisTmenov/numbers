package com.denis.numbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		while (true) {
			System.out.println("Enter a number between 2 and 6.");
			Scanner in = new Scanner(System.in);
			if (in.hasNextInt()) {
				int num = in.nextInt();
				if (num >= 2 && num <= 6) {
					Task.printPalindromNumbersFromSimpleNumbers(num);
					break;
				} else if (num < 2) {
					System.out.println("Please enter a number greater than or equal to 2.");
					continue;
				} else if (num > 6) {
					System.out.println("Please enter a number less than or equal to 6.");
					continue;
				}
			} else {
				System.out.println("Please enter an integer.");
				continue;
			}
		}

		System.out.println("Thank you for using the program.");
	}

}
