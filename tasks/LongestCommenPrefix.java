package com.tasks;

import java.util.Scanner;

public class LongestCommenPrefix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Length : ");
		int length = scan.nextInt();
		String[] str = new String[length];
		int min = Integer.MAX_VALUE;
		String s = ""; 
		for(int i = 0;i<length;++i) {
			
			str[i] = scan.next();
			if(str[i].length() < min) {
				
				min = str[i].length();
				s = str[i];
			}
		}
		new LongestCommenPrefix().findLCP(str,min,s);
		scan.close();
	}

	private void findLCP(String[] str, int min, String s) {

		for(int i = min;i>0;--i) {
			
			boolean isExist = true;
			for(int j = 0;j<str.length;++j) {
				
				if(!str[j].substring(0,i).equals(s.substring(0,i))) {
					
					isExist = false;
				}
			}
			if(isExist == true) {
				
				System.out.println("Output : "+s.substring(0,i));
				break;
			}
		}
	}
}
