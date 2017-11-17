package com.denis.numbers;

import java.util.ArrayList;
import java.util.List;

public class SimpleNumbers {

	public static List<Integer> getSimpleNumbers(int digitNumber) {

		List<Integer> simpleNumbers = new ArrayList<Integer>();

		int maxNumber = getMaxNumber(digitNumber);

		List<Integer> allNumbers = getListNumbers(maxNumber);

		int i = 2;

		while (i <= maxNumber) {
			if (allNumbers.get(i) != 0) {
				simpleNumbers.add(allNumbers.get(i));
				for (int j = 1; j * i <= maxNumber; j++) {
					allNumbers.set(j * i, 0);
				}
			}

			i++;
		}

		return simpleNumbers;
	}

	private static int getMaxNumber(int digitNumber) {

		int maxNumber = 1;

		for (int i = 0; i < digitNumber; i++) {

			maxNumber *= 10;
		}

		maxNumber--;

		return maxNumber;
	}

	private static List<Integer> getListNumbers(int maxNumber) {
		List<Integer> allNumbers = new ArrayList<Integer>();

		for (int i = 0; i <= 1; i++) {
			allNumbers.add(0);
		}

		for (int i = 2; i <= maxNumber; i++) {
			allNumbers.add(i);
		}

		return allNumbers;
	}

}
