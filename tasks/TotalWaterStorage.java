package com.tasks;

import java.util.*;

public class TotalWaterStorage {

//	public static void main(String[] args) {
//		int[] a={2,1,0,0,1,2};
//		int maxLeft=0, maxRight=0, result=0;
//		int left=0,right=a.length-1;
//		
//		while(left<=right) {
//			if(a[left]<=a[right]) {
//				if(a[left]>=maxLeft) {
//					maxLeft=a[left];
//				}else {
//					result += maxLeft-a[left];
//				}
//				left++;
//			}else {
//				if(a[right]>=maxRight) {
//					maxRight=a[right];
//				}else {
//					result += maxRight-a[right];
//				}
//				right--;
//			}
//		}
//		System.out.println(result);
//	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		int length = scan.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter Values");
		for (int i = 0; i < length; ++i) {

			arr[i] = scan.nextInt();
		}
		new TotalWaterStorage().findWaterStorage(arr, length);
		scan.close();
	}

	private void findWaterStorage(int[] arr, int length) {

		int st = 0, end = length - 1, min = 0;
		int storage = 0, point = 0;
		while (st < end) {

			if (arr[st] > min && arr[end] > min) {

				if (arr[st] > arr[end]) {

					min = arr[end];
				} else {

					min = arr[st];
				}
			} else if (arr[st] < min) {

				storage += min - arr[st];
			} else if (arr[end] < min) {

				storage += min - arr[end];
			}

			if (st == 0 && end == length - 1) {

				if (arr[st] > arr[end]) {

					point = st;
					end--;
				} else {

					point = end;
					st++;
				}
			} else if (st == point) {

				if (arr[end] > arr[point]) {

					point = end;
					st++;
				} else {

					end--;
				}
			} else if (end == point) {

				if (arr[st] > arr[point]) {

					point = st;
					end--;
				} else {

					st++;
				}
			}
		}
		System.out.println("Water Storage :" + storage);
	}
}