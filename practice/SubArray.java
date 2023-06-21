package com.practice;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {

		new SubArray().getInputs();
	}

	private void getInputs() {

		Scanner scanner = new Scanner(System.in);
		try {

			System.out.print("Enter Length : ");
			int length = scanner.nextInt();
			int[] array = new int[length];
			System.out.println("Enter Elements");
			for (int i = 0; i < length; ++i) {

				array[i] = scanner.nextInt();
			}
			System.out.print("sum : ");
			int sum = scanner.nextInt();
			findSubArray(array, length, sum);
		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		} finally {

			scanner.close();
		}
	}

	private void findSubArray(int[] array, int length, int sum) {

		try {

			int st = -1, end = -1;
			int tempSum = 0;
			boolean subArrayExist = false;
			if (length > 0) {

				if (array[0] < sum) {

					st = 0;
					tempSum += array[0];
				}
			}
			for (int i = 1; i < length;) {

				if (array[i] + tempSum < sum) {

					end = i;
					tempSum += array[i];
					i++;
				} else if (array[i] + tempSum == sum) {
				
					end = i;
					System.out.println((st+1)+" "+(end+1));
					subArrayExist = true;
					break;
				}
				else {
					
					tempSum -= array[st];
					st++;
				}
			}
			System.out.println((subArrayExist == false) ? "Sub Array Not Exist" : "");
		} catch (Exception e) {
			System.out.println("Index Reached!!!");
		}
	}
}
