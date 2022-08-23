package database;
import java.util.*;
public class ImplementationStackWithLinkedlist{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node top = null;
	void push(int data) {
		Node newnode = new Node(data);
		if(top==null) {
			newnode.next = null;
			top = newnode;
		}else {
			newnode.next = top;
			top = newnode;
		}
	}
	void pop() {
		if(top==null) {
			System.out.println("overflow");
		}else {
			top = top.next;
			
		}
	}
	void Traversing() {
		if(top == null) {
			System.out.println("Empty stack");
		}else {
			Node temp = top;
			while(temp!=null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ImplementationStackWithLinkedlists = new ImplementationStackWithLinkedlist();
//		System.out.println("Enter how many elements in this stack");
//		noe = input.nextInt();
		int choice=0;
		while(choice!=4) {
			System.out.println("-------Stack operation's is------------");
			System.out.println("Enter 1 for Push");
			System.out.println("Enter 2 for Pop");
			System.out.println("Enter 3 for Traversing");
			System.out.println("Enter 4 for Exit");
			System.out.print("Enter your choice : ");
			choice = input.nextInt();
			switch(choice) {
			case 1:
				int data;
				System.out.print("Enter data you want to insert : ");
				data  = input.nextInt();
				s.push(data);
				System.out.println("Data insert successfully");
				System.out.println();
				break;
			
			case 2:
				s.pop();
				System.out.println("Data delete successfully");
				System.out.println();
				break;
			
			case 3:
				s.Traversing();
				System.out.println();
				break;
			
			case 4:
				System.exit(0);
				break;
			
			default:
				System.out.println("Invalid choice please select a valid choice");
				break;
			}
		}
	}
}
