package com.practice;

import java.util.Scanner;

public class RegularExpressionMatching {

	public static void main(String[] args) {

		new RegularExpressionMatching().getInputs();
	}

	private void getInputs() {

		Scanner scanner = new Scanner(System.in);
		try {

			System.out.print("Enter Regular Expression String : ");
			String str1 = scanner.nextLine();
			System.out.print("Enter String : ");
			String str2 = scanner.nextLine();
			System.out.println(matchingRegularExpression(str1, 0, str2, 0));
		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		} finally {

			scanner.close();
		}
	}

	private boolean matchingRegularExpression(String str1, int index1, String str2, int index2) {

		boolean isMatching = true;
		try {

			for (int i = index1; i < str1.length(); ++i) {

				if (index2 < str2.length()
						&& (str1.charAt(index1) == str2.charAt(index2) || str1.charAt(index1) == '.')) {

					index1++;
					index2++;
					if (index1 == str1.length() && index2 != str2.length()) {
						System.out.println(index1 + " " + index2);
						isMatching = false;
					}
					continue;
				} else if (str1.charAt(index1) == '*') {

					int tempIndex = index1;
					for (int j = index1; j < str1.length(); ++j) {

						if (str1.charAt(j) != '*' && str1.charAt(j) != '.') {
							index1 = j;
							break;
						} else if ((j + 1) == str1.length()) {

							isMatching = true;
							return isMatching;
						}
						System.out.println(j);
					}
					if (str1.charAt(tempIndex) != '.') {

						for (int j = index2; j < str2.length(); ++j) {
							System.out.println(j);
							if (str1.charAt(tempIndex) != str2.charAt(j)) {

								if (matchingRegularExpression(str1, index1, str2, j)) {

									isMatching = true;
									break;
								} else {
									isMatching = false;
									System.out.println(j);
								}
							} 
//								else if (j + 1 == str2.length()) {
//
//								isMatching = false;
//							}
//							else {
//								isMatching = false;
//							}
						}
					} else {

						for (int j = index2 + 1; j < str2.length(); ++j) {
							System.out.println(j);
							if (str2.charAt(j - 1) != str2.charAt(j)) {

								if (matchingRegularExpression(str1, index1, str2, j)) {

									isMatching = true;
									break;
								} else {
									isMatching = false;
									System.out.println(j);
								}
							} 
//							else if (j + 1 == str2.length()) {
//
//								isMatching = false;
//							}
//							else {
//								isMatching = false;
//							}
						}

					}
				} else if (index2 >= str2.length()) {

					isMatching = false;
				}
				if (index1 + 1 == str1.length() && index2 + 1 == str2.length()) {

					return isMatching;
				}
				return isMatching;
			}
		} catch (Exception e) {

			System.out.println("Index Reached!!!");
		}
		return isMatching;
	}
}
