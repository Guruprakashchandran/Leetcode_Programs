package com.practice;

import java.util.Scanner;

public class ValidNumber {

	public static void main(String[] args) {
		
		new ValidNumber().getInput();
	}

	private void getInput() {

		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.print("Enter Value : ");
			String value = scanner.next();
			System.out.println(isValue(value) ? "true" : "false");
		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		}
		finally {
			scanner.close();
		}
	}

	private boolean isValue(String value) {

//		String Numberic = "valid";
		String mathematicNumber = "valid";
		String eSymbol = "not valid";
		String dot = "valid";
		boolean eCharFirstTime = true;
		String symbol = "valid";
		boolean isValid = true;
		try {
			
			for(int i = 0;i < value.length();++i) {
				
				if((value.charAt(i) =='e' || value.charAt(i) =='E') && eSymbol == "valid" && (i+1) < value.length()) {
					
					eSymbol = "not valid";
					symbol = "valid";
					dot = "not valid";
				}
				else if((value.charAt(i) == '+' || value.charAt(i) == '-') && symbol == "valid" && (i+1) < value.length()) {
					
					symbol = "not valid";
				}
				else if(value.charAt(i) == '.' && dot == "valid" && value.length() != 1 && ((i > 0 && value.charAt(i-1) >= '0' && value.charAt(i) <= '9') || (i < value.length()-1 && value.charAt(i+1) >= '0' && value.charAt(i) <= '9'))) {
					
					dot = "not valid";
				}
				else if(value.charAt(i) >= '0' && value.charAt(i) <= '9' && mathematicNumber == "valid") {
					
					symbol = "not valid";
					if(eCharFirstTime == true) {
						
						eSymbol = "valid";
						eCharFirstTime = false;
					}
				}
				else {
					isValid = false;
					break;
				}
			}
			return isValid;
		} catch (Exception e) {

			System.out.println("Index Reached!!!");
		}
		return false;
	}
}
