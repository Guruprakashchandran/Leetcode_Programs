package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class MissingNumber {

	public static void main(String[] args) {

		new MissingNumber().getInputs();
	}

	private void getInputs() {

		Scanner scanner = new Scanner(System.in);
		try {

			System.out.print("Enter Total Elements : ");
			int totalElements = scanner.nextInt();
			int[] array = new int[totalElements - 1];
			List<Integer> list = new LinkedList<>();
			for(int i = 0;i < totalElements-1;++i) {
				
				array[i] = scanner.nextInt();
				list.add(array[i]);
			}
//			List<int[]> list = Arrays.asList(array);
			for(int i = 1;i<totalElements+1;++i) {
				
				if(!list.contains(i)) {
					
					System.out.println("Missing Value : "+ i);
				}
			}

		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		} finally {

			scanner.close();
		}
	}
}
