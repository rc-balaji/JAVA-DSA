package edu.ngp.stack;

import java.util.Stack;

public class ValidBrackerts {

	public static void main(String[] args) {
		
		Stack<String> s1 = new Stack<>();
		
		Stack<String> s2 = new Stack<>();
		
		
		String str = "$";
		
		int count = 0;
		
		int n = str.length();
		
		for(int i=0;i<n;i++) {
			s1.add(""+str.charAt(i));
		}
		
		boolean isTrue = true;
		
		while(!s1.isEmpty()) {
			if(s1.peek().equals(")")) {
				s2.push(s1.pop());
			}
			else {
				if(!s2.isEmpty()) {
					count++;
					s1.pop();
					s2.pop();
				}else {
					s1.pop();
					isTrue = false;
				}
				
			}
		}
		
		if(isTrue && s2.isEmpty()) {
			
			System.out.printf("Valid String\nValidCount: %d ",count);
		}else {
			System.out.printf("Invalid String\nValidCount: %d ",count);

		}
		
		
		
		
	}

}
