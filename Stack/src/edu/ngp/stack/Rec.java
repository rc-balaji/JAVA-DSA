package edu.ngp.stack;

public class Rec {

	
	public static void m1(int n) {
		
		System.out.println(n);
		
		if(n<=2) {
			m1(n+1);
		}
		
		System.out.println(n);
//		return n*m1(n-1);
	}
	
	
	
	
	public static void main(String[] args) {
		
		m1(1);
//		System.out.println(m1(4));
		
	}

}
