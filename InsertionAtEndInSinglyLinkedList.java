package database;
import java.util.*;
public class LLLL {
	static class Node{ 
		int data;
		Node next;	
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	public void printlist() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node currentNode = head;
		System.out.print("Linked list is : ");
		while(currentNode!= null) {
			System.out.print(currentNode.data+" ");
			currentNode= currentNode.next;
		}
		System.out.println();
	}
	public void addlast(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			return;
		}
		Node currentNode = head;
		while(currentNode.next!=null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newnode;
	}
	public static void main(String[] args) {
		LLLL list = new LLLL();
		Scanner input = new Scanner(System.in);
		int index,data;
		list.head = new Node(10);

		Node first = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);
		Node five = new Node(50);
		
		list.head.next = first;
		first.next = third;
		third.next = four;
		four.next = five;
		five.next = null;
		System.out.println("Enter data : ");
		data = input.nextInt();
		list.printlist(); 
		list.addlast(data);
		list.printlist(); 
	}
}
