package com.tasks;

import java.util.Scanner;
import java.util.Stack;

public class PostfixExpression {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Expression : ");
		String exp = scan.next();
		new PostfixExpression().evaluatePostfixExpression(exp);
		scan.close();
	}

	private void evaluatePostfixExpression(String exp) {

		Stack<Integer> storage = new Stack<Integer>();
		for (int i = 0; i < exp.length(); i++) {
			
			if(exp.charAt(i) >= '0'  && exp.charAt(i) <= '9' ) {
				
				storage.push(Character.getNumericValue(exp.charAt(i)));
			}
			else {
				
				int val1 = storage.pop();
				if(exp.charAt(i) == '+') {
					
					storage.push(storage.pop() + val1);
				}
				else if(exp.charAt(i) == '-') {
					
					storage.push(storage.pop() - val1);
				}
				else if(exp.charAt(i) == '*') {
					
					storage.push(storage.pop() * val1);
				}
				else if(exp.charAt(i) == '/') {
		
					storage.push(storage.pop() / val1);
				}
				else {
					
					storage.push(storage.pop() % val1);
				}
			}
		}
		System.out.println("Output : "+storage.pop());
	}
}
