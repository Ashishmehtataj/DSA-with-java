import java.util.*;
public class InsertionAtIndexInSinglyLinkedList {
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
	public void insertatindex(int data,int index) {
		Node newnode = new Node(data);
		int i=0;
		Node temp = head;
		while(i!=index-1) {
			temp = temp.next;
			i++;
		}
		newnode.data = data;
		newnode.next = temp.next;
		temp.next = newnode;	
	}
	public static void main(String[] args) {
		lll InsertionAtIndexInSinglyLinkedList = new InsertionAtIndexInSinglyLinkedList();
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
		System.out.println("Enter index : ");
		index = input.nextInt();
		System.out.println("Enter data : ");
		data = input.nextInt();
		list.printlist(); 
		list.insertatindex(data,index);
		list.printlist(); 
	}
}
