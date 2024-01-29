package ngp.edu.tree;

public interface ITreeService {

	public Node create(String val);
	public Node create(Node left,String val);
	public Node create(String val,Node right);
	public Node create(Node left,String val,Node right);
	
	
	public void PreOrder(Node root);
	public void PostOrder(Node root);
	public void InOrder(Node root);
	
	
}
