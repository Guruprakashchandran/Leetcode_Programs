package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting0sAnd1s {

	public static void main(String[] args) {

		new Sorting0sAnd1s().getInputs();
	}

	private void getInputs() {

		Scanner scanner = new Scanner(System.in);
		try {

			System.out.print("Enter Length : ");
			int length = scanner.nextInt();
			System.out.println("Enter Elements");
			int[] array = new int[length];
			for (int i = 0; i < length; ++i) {
				array[i] = scanner.nextInt();
			}
			sorting0sAnd1s(array, length);
		} catch (Exception e) {

			System.out.println("wrong Input!!!");
		} finally {
			scanner.close();
		}
	}

	private void sorting0sAnd1s(int[] array, int length) {

		try {

			int firstValue = -1,secValue = -1;
			int value = -1;
			for(int i = 0;i < length;++i) {
				
				if(array[i] == 0) {
					
					secValue = firstValue != -1 && secValue == -1 ? i : secValue;
					firstValue = firstValue == -1 ? i : firstValue;
					if(value != -1) {
						
						array[firstValue] = array[value];
						array[value] = 0;
						i = value;
						value = -1;
						firstValue = secValue != -1 ? secValue : -1;
						secValue = secValue != -1 ? -1:secValue;
						i = value;
					}
				}
				else {
					
					value = value == -1 ? i : value;
					if(firstValue != -1) {
						
						array[firstValue] = array[value]; 
						array[value] = 0;
						i = value;
						value = -1;
						secValue = secValue != -1 ? -1:secValue;
					}
				}
			}
			System.out.println(Arrays.toString(array));
		} catch (Exception e) {

			System.out.println("Index Reached!!!");
		}
	}
}
