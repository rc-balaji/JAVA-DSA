package edu.ngp.stack;


import java.util.LinkedList;
import java.util.Queue;


public class Que {
	
	
	
	public static <T> void print(T str) {

		System.out.println(str);

	}

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();

		
		
		
		q.add("BYTS");
		q.add("India");
		q.add("Pro");
		q.add("World");
		
		while(!q.isEmpty()) {
			print(q.remove());
		}
		
		
	}

}


