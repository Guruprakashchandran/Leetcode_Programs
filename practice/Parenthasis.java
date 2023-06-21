package com.practice;

import java.util.Scanner;

public class Parenthasis {

	public static void main(String[] args) {
		
		new Parenthasis().getInput();
	}

	private void getInput() {

		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.print("Enter Parenthasis : ");
			String input = scanner.nextLine();
			System.out.println(countValidParenthasis(input,"",0,0));
		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		}
		finally {
			scanner.close();
		}
	}

	private int countValidParenthasis(String input, String string, int count, int i) {

		try {
			
			if(i == input.length()) {
				
				System.out.println((string != "" && input == "") ? "Invalid parenthasis" : "Valid parenthasis");
				return count;
			}
			if(input.charAt(i) == '(') {
				
				string += '(';
			}
			else if(string != ""){
				
				string = string.substring(0,string.length()-1);
				count += 2;
			}
			count = countValidParenthasis(input,string,count,++i);
			
			return count;
		} catch (Exception e) {

			System.out.println("Index Reached!!!");
		}
		return count;
	}
}
