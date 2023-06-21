package com.testset2;

import java.util.*;

public class DescendingWithFrequency {

	public static void main(String[] args) {
		
		new DescendingWithFrequency().getInputs();
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
			countFrequency(elements,length);
		}
		catch(Exception e) {
			
			System.out.println("Wrong Input!!!");
		}
		finally {
			
			scan.close();
		}
	}
	private void countFrequency(int[] elements, int length) {
		
		List<Integer> frequency = new LinkedList<>();
		List<Integer> elem = new LinkedList<>();
		for(int i = 0;i<length;++i) {
			
			if(!elem.contains(elements[i])) {
				
				int count = 1;
				for(int j = i+1;j<length;++j) {
					
					count = elements[j] == elements[i] ? ++count : count;
				}
				elem.add(elements[i]);
				frequency.add(count);
			}
		}
		decendingSort(elem,frequency);
	}
	private void decendingSort(List<Integer> elem, List<Integer> frequency) {

		for(int i = 0;i<frequency.size();++i) {
			
			for(int j = i+1;j<frequency.size();++j) {
				
				if(frequency.get(i) < frequency.get(j)) {
					
					swap(i,j,frequency,elem);
				}
			}
		}
		printingArray(frequency,elem);
	}
	private void printingArray(List<Integer> frequency, List<Integer> elem) {

		System.out.print("Output Array : ");
		for(int i = 0;i<frequency.size();++i) {
			
			for(int j = 0;j<frequency.get(i);++j) {
				
				System.out.print(elem.get(i));
			}
		}
	}
	private void swap(int i, int j, List<Integer> frequency, List<Integer> elem) {
		
		int temp = frequency.get(i);
		frequency.set(i, frequency.get(j));
		frequency.set(j, temp);
		swapelem(i,j,frequency,elem);
	}
	private void swapelem(int i, int j, List<Integer> frequency, List<Integer> elem) {
		
			int temp = elem.get(i);
			elem.set(i, elem.get(j));
			elem.set(j, temp);
	}
}
