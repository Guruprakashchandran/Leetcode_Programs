package com.tasks;

import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		for(int i = 0;i < 10;++i) {
			
			a[i] = scan.nextInt();
		}
		new FindDuplicate().findValue(a,b);
		scan.close();
	}

	private void findValue(int[] a, int[] b) {

		for(int i = 0;i<10;++i) {
			
			if(b[a[i]-1] > 0) {
				
				System.out.println("Duplicate value : "+a[i]);
				break;
			}
			b[a[i]-1]++;
		}
		System.out.println("No Duplicate Values!!!");
	}
}
