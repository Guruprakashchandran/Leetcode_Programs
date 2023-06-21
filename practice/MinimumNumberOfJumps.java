package com.practice;

import java.util.Scanner;

public class MinimumNumberOfJumps {

	public static void main(String[] args) {
		
		new MinimumNumberOfJumps().getInputs();
	}

	private void getInputs() {

		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.print("Enter Length : ");
			int length = scanner.nextInt();
			System.out.println("Enter Elements");
			int[] array = new int[length];
			for(int i = 0;i < length;++i) {
				
				array[i] = scanner.nextInt();
			}
			findMinimumNumberOfJumPs(array,length);
		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		}
		finally {
			
			scanner.close();
		}
	}

	private void findMinimumNumberOfJumPs(int[] array, int length) {

		try {
			
			int i = 0;
			int jumps = 1;
			int sum = 0;
			while(true) {
				
				sum += array[i];
				if(sum < length) {
					
					i = array[i];
					jumps++;
				}
				else {
					break;
				}
			}
			System.out.println("Minimum Jumps : "+jumps);
		} catch (Exception e) {
			System.out.println("Index Reached!!!");
		}
	}
}
