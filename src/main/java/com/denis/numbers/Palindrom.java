package com.denis.numbers;

public class Palindrom {

	public static boolean isPalindrom(long number) {

		char[] mas = String.valueOf(number).toCharArray();

		int i = 0;
		int j = mas.length - 1;

		for (; i <= j; i++, j--) {
			if (mas[i] != mas[j]) {
				return false;
			}
		}

		return true;
	}

}
