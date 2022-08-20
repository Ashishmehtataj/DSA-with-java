package database;
import java.util.*;
public class DeletionWithConditionInSinglyLinkedList {
	Node head = null;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	public void Traversing() {
		if(head==null) {
			System.out.println("Empty list");
		}else{
			Node temp = head;
			System.out.print("Linked list is : ");
			while(temp.next!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	public void DeleteAtFirst() {
		if(head == null) {
			System.out.println("Empty list");
		}else {
			Node temp = head;
			temp = temp.next;
			head = temp;
		}
	}
	public void DeleteAtPosition(int position) {
		Node temp=head;
		Node temp1=temp.next;
		for(int i=0;i<position-1;i++) {
			temp1 = temp;
			temp = temp.next;
		}
		temp1.next= temp.next;
//		temp = head;
	}
	public void DeleteAtEnd() {
		Node temp = head;
		Node temp1 = temp.next;
		while(temp1.next!=null) {
			temp = temp1;
			temp1 = temp1.next;
		}
		temp.next = null;
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int position,choice=0;
		DeletionWithConditionInSinglyLinkedList d = new DeletionWithConditionInSinglyLinkedList();
		d.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);
		Node five = new Node(50);
		Node six  = new Node(60);
		Node seven = new Node(70);
		Node eight = new Node(80);
		Node nine = new Node(90);
		Node ten = new Node(100);
		
		d.head.next = second;
		second.next = third;
		third.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;
		seven.next = eight;
		eight.next = nine;
		nine.next = ten;
		ten.next = null;
		
		while(choice!=5) {
			System.out.println("Enter 1 for Traversing");
			System.out.println("Enter 2 for DeleteAtFirst Node");
			System.out.println("Enter 3 for DeleteAtIndex Node");
			System.out.println("Enter 4 for DeleteAtEnd Node");
			System.out.println("Enter 5 for Exit");
			System.out.print("Enter your choice :");
			choice = input.nextInt();
			switch(choice) {
				case 1:
					d.Traversing();
					System.out.println();
					break;
			
				case 2:
					d.DeleteAtFirst();
					System.out.println("Node Delete Successfully!!");
					System.out.println();		
					break;
					
				case 3:
					System.out.println("Enter Position to you want to delete Node");
					position = input.nextInt();
					d.DeleteAtPosition(position);
					System.out.println("Node delete successfully");
					System.out.println();
					break;
				
				case 4:
					d.DeleteAtEnd();
					System.out.println("Node delete Successfully");
					System.out.println();
					break;
				
				case 5:
					System.exit(0);
					System.out.println();
					break;
				
				default:
					System.out.println("Invalid choice Please select a valid choice!!");
					System.out.println();
					break;
			}
			
		}
	}
}
