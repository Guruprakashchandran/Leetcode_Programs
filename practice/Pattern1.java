package com.practice;

import java.util.*;

/*
 * 	input : 3
 * 
 * output :
 *  			
 * 		1   1   1
 * 		  1   1
 * 			1
 * 		  1   1
 *      1   1   1
 */
class Pattern1{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		try{
			System.out.print("Enter Input : ");
			int input = scanner.nextInt();
			for(int i = 0;i<(input * 2) - 1;++i){
				for(int j = 0;j<(input * 2) - 1;++j){

					
					if(((i <= j && i + j <= (input * 2) - 2) || (i >= j && i + j >= (input * 2) - 2 )) && (i+j) % 2 == 0){

						System.out.print("1");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}	
			
		}
		catch(Exception e){

			System.out.println("Wrong Input!!!");
		}
		finally {
			
			scanner.close();
		}
	}
}
