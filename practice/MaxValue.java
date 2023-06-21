package com.practice;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		
		new MaxValue().getInputs();
	}

	private void getInputs() {

		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.print("Enter length : ");
			int length = scanner.nextInt();
			int[] array = new int[length];
			for(int i = 0;i < length;++i) {
				
				array[i] = scanner.nextInt();
			}
			findMaxValue(array,length);
		} catch (Exception e) {

		}
		finally {
			
			scanner.close();
		}
	}

	private void findMaxValue(int[] array, int length) {

		try {
		
			int sum = Integer.MIN_VALUE,temp = 0;
			for(int i = 0;i < length;++i) {
				
				temp += array[i];
				if(sum < temp) {
					
					sum = temp;
				}
				if(temp < 0) {
					
					temp = 0;
				}
			}
			System.out.println("Maximum Value : "+sum);
		} catch (Exception e) {

		}
	}
}
