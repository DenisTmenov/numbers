package com.denis.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {

	public static void printPalindromNumbersFromSimpleNumbers(int digitNumber) {

		List<Long> result = new ArrayList<Long>();
		Map<Long, String> resultMap = new HashMap<Long, String>();

		List<Integer> simpleNumbers = SimpleNumbers.getSimpleNumbers(digitNumber);

		Collections.sort(simpleNumbers, Collections.reverseOrder());

		for (int i = 0; i < simpleNumbers.size(); i++) {
			if (simpleNumbers.get(i).toString().length() == digitNumber) {
				for (int j = i + 1; j < simpleNumbers.size() - 1; j++) {
					if (simpleNumbers.get(j).toString().length() == digitNumber) {

						long multy = getMultiplicationNumbers(simpleNumbers.get(i), simpleNumbers.get(j));
						if (Palindrom.isPalindrom(multy)) {

							result.add(multy);

							StringBuilder sb = new StringBuilder();
							sb.append(simpleNumbers.get(i)).append(" * ").append(simpleNumbers.get(j));

							resultMap.put(multy, sb.toString());
						}
					}
				}
			}
		}

		Collections.sort(result, Collections.reverseOrder());

		for (long num : result) {
			StringBuilder sb = new StringBuilder();
			sb.append(num).append(" = ").append(resultMap.get(num));

			System.out.println(sb.toString());
		}

	}

	private static Long getMultiplicationNumbers(int a, int b) {

		return Long.valueOf(a) * Long.valueOf(b);
	}
}
