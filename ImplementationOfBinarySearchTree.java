package database;

public class ImplementationOfBinarySearchTree{
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
	void insert(int key) {
		root = insertion(root,key);
	}
	Node insertion(Node root,int data) {
		if(root == null) {
			root  = new Node(data);
			return root;
		}else if(data<root.data){
			root.left = insertion(root.left,data);
		}else if(data>root.data) {
			root.right = insertion(root.right,data);
		}
		return root;
	}
	public void inorder(Node temp) {
		if(temp!=null) {
			inorder(temp.left);
			System.out.println(temp.data+" ");
			inorder(temp.right);
		}
	}
	public static void main(String[] args) {
		ImplementationOfBinarySearchTreetree = new ImplementationOfBinarySearchTree();
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.inorder(tree.root);
	}
}
