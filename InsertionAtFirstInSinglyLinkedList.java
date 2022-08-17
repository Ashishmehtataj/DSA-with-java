import java.util.*;

import database.newlist.Node;
public class InserotionAtFirstInSinglyLinkedList {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	
	
	//add first
	public void addfirst() {
		int data,choice;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter data you want to insert in linked list : ");
			data = input.nextInt();
			Node newnode = new Node(data);
			if(head == null) {
				head = newnode;
				return; 
			}else {
				newnode.next = head;
				head = newnode;
			}
			System.out.println("If you want to insert more data in linked list than press 1 : ");
			choice = input.nextInt();
		}while(choice==1);
		
	}
	public void printlist() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node currentNode = head;
		while(currentNode!= null) {
			System.out.println(currentNode.data+" ");
			currentNode= currentNode.next;
		}
	}
	public static void main(String[] args) {
		InserotionAtFirstInSinglyLinkedList list = new InserotionAtFirstInSinglyLinkedList();
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
		list.addfirst();
		list.printlist(); 
	}
}
