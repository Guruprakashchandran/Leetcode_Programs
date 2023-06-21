package com.practice;

import java.util.Scanner;

public class BinaryValue {

	public static void main(String[] args) {

		new BinaryValue().getInputs();
	}

	private void getInputs() {

		Scanner scanner = new Scanner(System.in);
		try {

			System.out.print("Enter First Value : ");
			int firstValue = scanner.nextInt();
			System.out.print("Enter Second Value : ");
			int secValue = scanner.nextInt();
			int maxValue = firstValue > secValue ? findValue(firstValue) : findValue(secValue);
//			System.out.println(maxValue);
			String s1 = convertingBinaryValue(firstValue, maxValue);
			String s2 = convertingBinaryValue(secValue, maxValue);
//			System.out.println(s1+" "+s2);
			int rightMostIndex = comparingTwoValues(s1, s2);
			System.out.println("Right Most Index : "+rightMostIndex);
		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		} finally {

			scanner.close();
		}
	}

	private int comparingTwoValues(String s1, String s2) {

		try {

			for (int i = s1.length()-1; i >= 0; --i) {
				
				if(s1.charAt(i) != s2.charAt(i)) {
					return s1.length() - i;
				}
			}
		} catch (Exception e) {

			System.out.println("Index Reached!!1");
		}
		return 0;
	}

	private String convertingBinaryValue(int value, int maxValue) {

		String s = "";
		try {

			while (maxValue != 0) {

				if (value >= maxValue) {

					value = value - maxValue;
					s += '1';
				} else {
					s += '0';
				}
				maxValue /= 2;
			}
		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		}
		return s;
	}

	private int findValue(int value) {

		int i = 1;
		try {

			while (i < value) {
				i *= 2;
			}
		} catch (Exception e) {

			System.out.println("Exception");
		}
		return i;
	}
}
