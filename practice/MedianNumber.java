package com.practice;

import java.util.Scanner;

public class MedianNumber {

	public static void main(String[] args) {

		new MedianNumber().getInputs();
	}

	private void getInputs() {

		Scanner scanner = new Scanner(System.in);
		try {

			System.out.print("Array 1 length : ");
			int length1 = scanner.nextInt();
			System.out.println("Enter Array 1 Elements");
			int[] arr1 = new int[length1];
			for (int i = 0; i < length1; ++i) {

				arr1[i] = scanner.nextInt();
			}
			System.out.print("Array 2 length : ");
			int length2 = scanner.nextInt();
			System.out.println("Enter Array 2 Elements ");
			int[] arr2 = new int[length2];
			for (int i = 0; i < length2; ++i) {

				arr2[i] = scanner.nextInt();
			}
			System.out.println(findMedianNumber(length1, length2, arr1, arr2));
		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		} finally {

			scanner.close();
		}
	}

	private double findMedianNumber(int length1, int length2, int[] arr1, int[] arr2) {

		try {
			int medianNumber = (length1 + length2) / 2;
			if ((length1 + length2) % 2 == 0) {

				medianNumber--;
			}
			int ind1 = 0, ind2 = 0;
			int i = 1;
			boolean isReach = false;
			double sum = 0;
			if (length1 == 0 && length2 == 0) {
				return 0;
			} else if (length1 == 0) {

				return (medianNumber(arr2, length2));
			} else if (length2 == 0) {

				return (medianNumber(arr1, length1));
			}
			else if(length1 == 1 && length2 == 1) {
				
				return ((double)(arr1[0] + arr2[0])/2);
			}
			else {

				System.out.println("median Number : " + medianNumber);
				while (i < (length1 + length2)) {
//					System.out.println("index 1 : " + ind1);
//					System.out.println("index 2 : " + ind2);

					System.out.println(length1 + length2);
					if ((medianNumber) == i) {

						if (arr1[ind1] < arr2[ind2]) {

							if (ind1 + 1 < length1 && arr2[ind2] > arr1[ind1 + 1]) {

								ind1++;
								sum = arr1[ind1];
								isReach = true;
								if((length1+ length2)%2 == 0) {
									
									if(ind1 + 1 < length1 && arr1[ind1+1]  < arr2[ind2]) {
										
										sum+= arr1[++ind1];
									}
									else {
										
										sum += arr2[ind2];
									}
									sum = (double) (sum / 2);
								}
							}

							else {
								sum = arr2[ind2];
								if((length1 + length2) % 2 == 0) {
									
									if(ind2 + 1 < length2 && ind1 + 1 < length1 && arr2[ind2 + 1] > arr1[ind1 + 1]) {
										
										sum += arr1[++ind1];
									}
									else if(ind2 + 1 < length2){
										
										sum += arr2[++ind2];
									}
									else {
										
										sum += arr1[++ind1];
									}
									sum = (double) (sum / 2);
								}
							}

						} else {

							if (ind2 + 1 < length2 && arr1[ind1] > arr2[ind2 + 1]) {

								ind2++;
								sum = arr2[ind2];
								isReach = true;
								if((length1 + length2) % 2 == 0) {
									
									if(ind2 + 1 < length2 && arr2[ind2 + 1] < arr1[ind1]) {
										
										sum += arr2[++ind2];
									}
									else {
										
										sum += arr1[ind1];
									}
									sum = (double) (sum / 2);
								}
							} else {
								
								sum = arr1[ind1];
								if((length1 + length2) % 2 == 0) {
									
									if(ind2 + 1 < length2 && ind1 + 1 < length1 && arr2[ind2 + 1] < arr1[ind1 + 1]) {
										
										sum += arr2[++ind2];
									}
									else if(ind1 + 1 < length1){
										
										sum += arr1[++ind1];
									}
									else {
										
										sum += arr2[++ind2];
									}
									sum = (double) (sum / 2);
								}
							}

						}
//						if ((length1 + length2) % 2 == 0) {
//
//							System.out.println(ind1 + " " + ind2);
//							
//							
//							if (arr1[ind1] < arr2[ind2]) {
//
//								if (isReach) {
//
//									if(ind1 + 1 < length1 && arr1[ind1 + 1] < arr2[ind2]) {
//										
//										sum+=arr1[ind1+1];
//									}
//									else {
//									
//										sum += arr2[ind2];
//									}
//								} else {
//
//									sum += (ind1 + 1) != length1 ? arr1[++ind1] : ind2 < length2 ? arr2[++ind2] : arr2[ind2];
//								}
//							} else {
//
//								if (isReach) {
//
//									if(ind2 + 1 < length2 && arr2[ind2 + 1] < arr1[ind1]) {
//										
//										sum += arr2[ind2+1];
//									}
//									else {
//										
//									
//										sum += arr1[ind1];
//									}
//								} else {
//									sum += ((ind2 + 1) < length2) ? arr2[++ind2] : (ind1 + 1) < length1 ? arr1[++ind1] : arr1[ind1];
//								}
//							}
//							sum = (double) (sum / 2);
//						}
						return ((double) sum);
					}
					if (arr1[ind1] < arr2[ind2]) {

						@SuppressWarnings("unused")
						int temp = (ind1 + 1) != length1 ? ++ind1 : ++ind2;
					} else {

						@SuppressWarnings("unused")
						int temp = ((ind2 + 1) < length2) ? ++ind2 : ++ind1;
					}
					i++;
				}
			}
		} catch (Exception e) {

			System.out.println("Index Reached!!!");
		}
		return 0;
	}

	private double medianNumber(int[] arr, int length) {

		try {

			if (length % 2 == 0) {

				length /= 2;
				return (((double) (arr[length] + arr[length - 1]) / 2));
			} else {

				length /= 2;
				return ((double) arr[length]);
			}
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Index Reached!!!");
		}
		return 0;
	}
}
