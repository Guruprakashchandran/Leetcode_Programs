package com.practice;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Merge_K_SortedArray {

	public static void main(String[] args) {
		
		new Merge_K_SortedArray().getInputs();
	}

	private void getInputs() {

		Scanner scanner = new Scanner(System.in);
		try {
			
			List<List<Integer>> elements = new ArrayList<>();
			System.out.print("Enter Array Size : ");
			int size = scanner.nextInt();
			int[] temp = new int[size];
			int totalSize = 0;
			for(int i = 0; i < size;++i) {
				
				System.out.print("Enter "+(i + 1)+" Array Elements : ");
				int listSize = scanner.nextInt();
				totalSize += listSize;
				List<Integer> list = new ArrayList<>();
				for(int j = 0;j < listSize;++j) {
					
					list.add(scanner.nextInt());
				}
				elements.add(list);
			}
			mergeElements(temp,elements,totalSize);
		} catch (Exception e) {

			System.out.println("Index Reached!!!");
		}
		finally {
			
			scanner.close();
		}
	}

	private void mergeElements(int[] temp, List<List<Integer>> elements, int totalSize) {

		try {
			int[] newArray = new int[totalSize];
			for(int i = 0;i < totalSize;++i) {
				
				int tempValue = 0;
				int smallValue = Integer.MAX_VALUE;
				for(int j = 0;j < temp.length;++j) {
					
					if((temp[j] + 1) <= elements.get(j).size() && smallValue > elements.get(j).get(temp[j])) {
						
						tempValue = j;
						smallValue = elements.get(j).get(temp[j]);
					}
				}
				temp[tempValue] += 1;
				newArray[i] = smallValue;
			}
			System.out.println(Arrays.toString(newArray));
			
		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		}
	}
}
