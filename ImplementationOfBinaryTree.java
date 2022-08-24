package database;

public class ImplementationOfBinaryTree{
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	Node root;
	 void PreOrderTraversing(Node temp) {
		if(temp!=null) {
			System.out.print(temp.data+" ");
			PreOrderTraversing(temp.left);
			PreOrderTraversing(temp.right);
		}
	}
	public void PostOrderTraversing(Node temp) {
		if(temp!=null) {
			PostOrderTraversing(temp.left);
			PostOrderTraversing(temp.right);
			System.out.print(temp.data+" ");
		}
	}
	public void InOrderTraversing(Node temp) {
		if(temp!=null) {
			InOrderTraversing(temp.left);
			System.out.print(temp.data+" ");
			InOrderTraversing(temp.right);
		}
	}
	public static void main(String args[]) {
		ImplementationOfBinaryTreetree = new ImplementationOfBinaryTree();
		tree.root = new Node(10);
		
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		
		tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(70);
		
		tree.root.left.left.left = new Node(80);
		tree.root.left.left.right = new Node(90);
		
		tree.root.left.right.left = new Node(100);
		tree.root.left.right.right = new Node(110);
		
		tree.root.right.left.left = new Node(120);
		tree.root.right.left.right = new Node(130);
		
		tree.root.right.right.left = new Node(140);
		tree.root.right.right.right = new Node(150);

		
		System.out.print("Preorder Traversing tree : ");
		tree.PreOrderTraversing(tree.root);
		System.out.println();
		
		System.out.print("InOrder Traversing tree : ");
		tree.InOrderTraversing(tree.root);
		System.out.println();
		
		System.out.print("PostOrder Traversing tree : ");
		tree.PostOrderTraversing(tree.root);
		System.out.println();

		
	}
}
