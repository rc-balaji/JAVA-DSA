package ngp.edu.tree;

public class Tree implements ITreeService {

	@Override
	public Node create(String val) {
		return new Node(val);

	}

	@Override
	public Node create(Node left, String val) {
		Node root = new Node(val);

		root.left = left;

		return root;
	}

	@Override
	public Node create(String val, Node right) {
		Node root = new Node(val);

		root.right = right;

		return root;
	}

	@Override
	public Node create(Node left, String val, Node right) {
		Node root = new Node(val);

		root.left = left;
		root.right = right;

		return root;

	}

	@Override
	public void PreOrder(Node root) {
		if (root != null) {
			System.out.print(root.data+" ");
			PreOrder(root.left);
			PreOrder(root.right);
		}

	}

	@Override
	public void PostOrder(Node root) {
		if (root != null) {
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.print(root.data+" ");
		}
	}

	@Override
	public void InOrder(Node root) {
		if (root != null) {
			InOrder(root.left);
			System.out.print(root.data+" ");
			InOrder(root.right);
		}
	}

}
