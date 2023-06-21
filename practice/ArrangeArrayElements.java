package com.practice;

import java.util.Arrays;

public class ArrangeArrayElements {

	public static void main(String[] args) {

		new ArrangeArrayElements().elementsArrange();
	}

	private void elementsArrange() {

		try {
			int nonZero = 0,nextNonZero = 1;
			int zero = 0;
			int[] arr = {1,2,3,1,0,0,0};
//			int[] arr = {0,0,0,0,0,0};
			while(zero != arr.length) {
				
//				System.out.println(zero+" "+nonZero);
				if(arr[nonZero] == 0 && arr[zero] != 0) {
					nonZero = zero;
				}
				else if(arr.length > 1 && arr[nextNonZero] == 0 && arr[zero] != 0) {
					nextNonZero = zero;
				}
				else if(arr[zero] == 0 && arr[nonZero] != 0){
					
//					System.out.println(zero+" "+nonZero);
					arr[zero] = arr[nonZero];
					arr[nonZero] = 0;
				
					if(arr[nextNonZero] != 0) {
						System.out.println(zero+" "+nonZero+" "+nextNonZero);
						nonZero = nextNonZero;
						nextNonZero += 1;
					}
					else {
						
						nonZero = zero;
					}
				}
				zero++;
			}
			trailing1s(arr,nonZero);
			System.out.println(nonZero);
			System.out.println(Arrays.toString(arr));
		} catch (Exception e) {

			System.out.println("Index Reached!!!");
		}
	}

	private void trailing1s(int[] arr, int nonZero) {

		try {
			
			boolean allNumberZero = false;
			if(arr[0] == 0 && nonZero == 0) {
				
				allNumberZero = true;
			}
			if(allNumberZero == false) {
				
				int one = nonZero,nonOne = nonZero,nextNonOne = nonZero + 1;
				while(one  < arr.length) {
					
					if(arr[nonOne] == 1 && arr[one] != 1) {
						
						nonOne = one;
					}
					else if(arr[nextNonOne] == 1 && arr[one] == 1) {
						
						nextNonOne = one;
					}
					else if(arr[one] == 1 && arr[nonOne] != 1) {
						
						arr[one] = arr[nonOne];
						arr[nonOne] = 1;
						if(arr[nextNonOne] != 1) {
							
							nonOne = nextNonOne;
							nextNonOne++;
						}
						else {
							
							nonOne = one;
						}
					}
					one++;
				}
			}
		} catch (Exception e) {

			System.out.println("Index Reached!!");
		}
	}

//	private void elementsArrange() {
//
//		int zero = 0, nonZero = 0, nextZero = 1;
////		int[] arr = { 1, 2, 0, 4, 0, 5, 0, 3, 8 };
//		int[] arr = {0,1,0,2,3,0,-4};
////		int[] arr = {0,0,0,2,3,4};
////		int[] arr = {2,3,4,0,0,0}:
//		
//		while (nonZero != arr.length) {
//
//			if (arr[zero] != 0 && arr[nonZero] == 0)
//				zero = nonZero;
//			else if (arr.length > 1 && arr[nextZero] != 0 && arr[nonZero] == 0)
//				nextZero = nonZero;
//			else if (arr[nonZero] != 0 && arr[zero] == 0) {
//
//				arr[zero] = arr[nonZero];
//				arr[nonZero] = 0;
//				if (arr[nextZero] == 0) {
//
//					zero = nextZero;
//					nextZero = zero + 1;
//				} else
//					zero = nonZero;
//			}
//			nonZero++;
//		}
//		System.out.println(Arrays.toString(arr));
//	}
}
