package com.testset2;

import java.util.*;

public class SortedwithPositions {

	public static void main(String[] args) {
		
		new SortedwithPositions().getInputs();
	}

	private void getInputs() {

		Scanner scan = new Scanner(System.in);
		try {
			
			System.out.print("Enter Length : ");
			int length = scan.nextInt();
			int[] elements = new int[length];
			System.out.println("Enter Elements");
			for(int i = 0;i < length;++i) {
				
				elements[i] = scan.nextInt();
			}
			sortingAnArray(elements,length);
			System.out.println(Arrays.toString(elements));
		}
		catch(Exception e) {
			
			System.out.println("Wrong Input!!!");
		}
		finally {
			
			scan.close();
		}
	}

	private void sortingAnArray(int[] elements,int length) {
		
//		int value = 0;
		for(int i = 0;i<length-2;++i) {
		
			if(i%2 == 0) {
				
				ascendingSort(i,elements,length);
			}
			else {
				
				decendingSort(i,elements,length);
			}
//			(i % 2 == 0)?:;
		}
	}

	private void decendingSort(int i, int[] elements,int length) {

		for(int j = i+2;j<length;j+=2) {
			
			if(elements[j] > elements[i]) {
				
				swap(i,j,elements);
			}
		}
	}

	private void ascendingSort(int i, int[] elements,int length) {
		
		for(int j = i+2;j<length;j+=2) {
			
			if(elements[j] < elements[i]) {
				
				swap(i,j,elements);
			}
		}
	}
	private void swap(int i, int j, int[] elements) {
		
		int temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
}
