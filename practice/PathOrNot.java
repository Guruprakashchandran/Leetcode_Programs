package com.practice;

import java.util.Scanner;

public class PathOrNot {

	public static void main(String[] args) {

		new PathOrNot().getInput();
	}

	private void getInput() {

		Scanner scanner = new Scanner(System.in);
		try {

			Character[][] area = { { 'T', 'T', 'F', 'T' },
								   { 'F', 'T', 'F', 'F' },
								   { 'T', 'F', 'T', 'F' },
								   { 'F', 'F', 'T', 'T' } };
			int size = 4;
			boolean isPath = false;
			String s = "";
			System.out.println(s != "" ? "" : "false");
			pathFinding(area, size, 0, 0,isPath,s);
		} catch (Exception e) {

			System.out.println("Wrong!!!");
		} finally {
			scanner.close();
		}
	}
 
	private void pathFinding(Character[][] area, int size, int i, int j,boolean isPath,String s) {

		try {
			if (i == size - 1 && j == size - 1 && area[i][j] == 'T') {

				isPath = true;
				System.out.println(s);
				return;
			}
			if(j + 1 < size && area[i][j] == 'T' && isPath == false) {
			
				s += 'R';
				pathFinding(area,size,i,j+1,isPath,s);
				s = s.substring(0,s.length()-1);
			}
			if(i + 1 < size && area[i][j] == 'T' && isPath == false) {
				
				s += 'D';
				pathFinding(area,size,i+1,j,isPath,s);
				s = s.substring(0,s.length()-1);
			}

		} catch (Exception e) {

			System.out.println("Index Reached!!!");
		}
		return;
	}
}
