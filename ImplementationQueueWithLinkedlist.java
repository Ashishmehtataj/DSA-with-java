package database;

import java.util.Scanner;

public class ImplementationQueueWithLinkedlist{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node front;
	Node rear;
	void enqueue(int data) {
		Node newnode = new Node(data);
		if(front == null) {
			front = newnode;
			rear = newnode;
			front.next = null;
			rear.next = null;
		}else {
			rear.next = newnode;
			rear = newnode;
			rear.next = null;
		}
	}
	void pop() {
		if(front == null) {
			System.out.println("Underflow");
		}else {
			Node temp = front;
			front = front.next;
		}
	}
	void Traversing() {
		if(front == null) {
			System.out.println("Empty Queue");
		}else {
			Node temp = front;
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ImplementationQueueWithLinkedlists = new ImplementationQueueWithLinkedlist();
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
				s.enqueue(data);
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
