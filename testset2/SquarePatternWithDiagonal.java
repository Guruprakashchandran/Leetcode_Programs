package com.testset2;

import java.util.*;

public class SquarePatternWithDiagonal {

	public static void main(String[] args) {

		new SquarePatternWithDiagonal().getInputs();
	}

	private void getInputs() {

		Scanner scan = new Scanner(System.in);
		try {

			System.out.print("Enter Pattern Size : ");
			int size = scan.nextInt();
			patternPrinting(size);
		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		}
	}

	private void patternPrinting(int size) {
		try {

			for (int i = 0; i < size; ++i) {

				for (int j = 0; j < size; ++j) {

					if (i == 0 || j == 0 || i == (size - 1) || j == (size - 1) || i == j || (j + i) == (size - 1)) {
						
						System.out.print("*");
					}
					else {
						
						System.out.print(" ");
					}
				}
				System.out.println();
			}

		} catch (Exception e) {

			System.out.println("Index Reached!!!");
		}
	}
}
