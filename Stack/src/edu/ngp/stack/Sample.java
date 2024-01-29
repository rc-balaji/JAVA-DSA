package edu.ngp.stack;

import java.util.Stack;

public class Sample {

	public static <T> void print(T str) {

		System.out.println(str);

	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		print(4);

		print(s.pop());
		print(s.pop());
		print(s.peek());

		print(s.isEmpty());
		print(s.size());

		print(s.peek());

		print(s.pop());

		print(s.pop());

		print(s.pop());

	}

}