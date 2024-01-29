package edu.ngp.stack;

public class Stack implements IStackService {

	Node top = null;
	int size = 0;

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void push(int x) {

		Node Newnode = new Node(x);
		Node temp = top;
		size++;
		if (temp == null) {
			top = Newnode;
		} else {
			Newnode.next = temp;
			top = Newnode;
		}

	}

	@Override
	public int pop() {

		if (top == null) {
			System.out.println("Stack is Empty!!!!");
			return -1;
		}
		size--;
		int data = top.data;
		top = top.next;
		return data;

	}

	@Override
	public int peek() {
		if (top != null) {
			return top.data;
		}
		System.err.println("Stack is Empty");
		return -1;

	}

	@Override
	public void printList() {
		Node temp = top;

		if (top == null) {
			System.out.println("Stack is Empty");
		}

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;

		}

	}

	@Override
	public int size() {
		
		return size;
	}

}
