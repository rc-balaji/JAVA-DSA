package ngp.edu.tree;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Tree t = new Tree();

		Node N40 = t.create("40");

		Node N50 = t.create("50");
		
		Node N60 = t.create("60");
		
		Node N20 = t.create(N40,"20",N50);
		
		Node N30 = t.create("30",N60);
		
		
		Node root  = t.create(N20,"10",N30);
		
		
		
		Node left = null;
		Node right = null;
		
		System.out.print("\nInOrder : ");
		t.InOrder(root);

		System.out.print("\nPreOrder : ");
		t.PreOrder(root);

		System.out.print("\nPostOrder : ");
		t.PostOrder(root);
		
		
		System.out.println();
		
	
		Stack<Node> stack = new Stack<>();	
		
		Node temp = root;
		
		while(temp!=null || !stack.isEmpty()) {
			
			while(temp!=null) {
				stack.push(temp);
				temp = temp.left;
				
			}
			
			temp = stack.pop();
			
			System.out.print(temp.data+" ");
			
			temp = temp.right;
			
				
				
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
