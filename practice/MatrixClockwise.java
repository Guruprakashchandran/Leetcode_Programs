package com.practice;

import java.util.Scanner;

public class MatrixClockwise {

	public static void main(String[] args) {

		new MatrixClockwise().getInputs();
	}

	private void getInputs() {

		Scanner scanner = new Scanner(System.in);
		try {

			System.out.print("size - ");
			int size = scanner.nextInt();
			int[][] matrix = new int[size][size];
			for (int i = 0; i < size; ++i) {

				for (int j = 0; j < size; ++j) {
					matrix[i][j] = scanner.nextInt();
				}
			}
			rotatingMatrix(matrix, size);

		} catch (Exception e) {

			System.out.println("Wrong Input!!!");
		} finally {
			scanner.close();
		}
	}

	private void rotatingMatrix(int[][] matrix, int size) {

		try {
		
			for (int i = 0; i < size / 2; ++i) {
				
				for (int j = 0; j < size - 1; ++j) {

					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][size - i - 1];
					matrix[j][size - i - 1] = matrix[size - i - 1][size - j - 1];
					matrix[size - i - 1][size - j - 1] = matrix[size - j - 1][i];
					matrix[size - j - 1][i] = temp;
				}
			}
			MatrixPrinting(matrix, size);
		} catch (Exception e) {

			System.out.println("Index Reached!!!");
		}
	}

	private void MatrixPrinting(int[][] matrix, int size) {

		try {

			for (int i = 0; i < size; ++i) {

				for (int j = 0; j < size; ++j) {

					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {

			System.out.println("Index Reached!!!");
		}
	}
}
