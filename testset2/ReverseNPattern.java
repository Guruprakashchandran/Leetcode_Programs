package com.testset2;

import java.util.*;

public class ReverseNPattern {

	public static void main(String[] args) {

		new ReverseNPattern().getInputs();
	}

	private void getInputs() {

		Scanner scan = new Scanner(System.in);
		try {

			System.out.print("Input String : ");
			String s = scan.next();
			System.out.print("Number Of Rows : ");
			int noOfRows = scan.nextInt();
			patternPrinting(s, noOfRows);
		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		} finally {

			scan.close();
		}
	}

	private void patternPrinting(String s, int noOfRows) {

		int row = 0, value = 0;
		while (s.length() > (row * noOfRows) + value) {

			row++;
			value += noOfRows - 2;
		}
		value = s.length() > (row * noOfRows + value) - noOfRows + 2 ? row + value : row + value - noOfRows + 2;
		char[][] array = new char[noOfRows][value];
		printing(0, 0, 0, array, s, noOfRows);
		printPattern(array);
	}

	private void printPattern(char[][] array) {
		
		for(int i = 0;i < array.length;++i) {
			
			for(int j = 0;j < array[i].length;++j) {
				
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

	private void printing(int row, int col, int value, char[][] array, String s, int noOfRows) {

		for (int i = 0; i < noOfRows; ++i) {

			if (value < s.length()) {

				array[i][col] = s.charAt(value);
				value++;
			} else
				return;
		}
		row = noOfRows - 2;
		col += 1;
		for (int r = row; r > 0; --r, ++col) {

			if (value < s.length()) {

				array[r][col] = s.charAt(value);
				value++;
			} else
				return;
		}
		printing(0,col,value,array,s,noOfRows);
	}
}
