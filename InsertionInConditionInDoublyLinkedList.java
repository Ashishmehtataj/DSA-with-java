import java.util.*;
import database.DLL.Node;

public class DoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode {
		private int data; // Can be any generic type
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0; // or head == null
	}
	
	public int length() {
		return length;
	}
	
	public void Traversing() {
		if(head == null) {
			return;
		}
		
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}

	public void insertEnd(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}
//	public void InsertAtIndex(int data,int index) {
//		
//	}
	public void InsertAtPosition(int data,int position) {
		ListNode newnode = new ListNode(data);
		int i=1;
		ListNode temp = head;
		ListNode temp1 = temp.next;
		while(i!=position-1) {
			temp = temp1;
			temp1.next = temp1;
			i++;
		}
		newnode.previous = temp;
		newnode.next = temp1;
		temp.next = newnode;
		temp1.previous = newnode;
		length++;
	}
public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
Scanner input = new Scanner(System.in);
		int choice = 0;
		while(choice!=5) {
			System.out.println("Enter 1 for Insert at First");
			System.out.println("Enter 2 for Insert at specifice position");
			System.out.println("Enter 3 for Insert  at End");
			System.out.println("Enter 4 for Traversing");
			System.out.println("Enter 5 for Exit");
			System.out.println("Enter your choice : ");
			choice = input.nextInt();
			switch(choice) {
				case 1:
					int data;
					System.out.println("Enter data : ");
					data  = input.nextInt();
					dll.insertFirst(data);
					System.out.println("Successfully insert data");
					System.out.println();
					break;
					
				case 2:
					int data0,position;
					System.out.println("Enter position you want to position new data : ");
					position = input.nextInt();
					System.out.println("Enter data you want to insert : ");
					data0  = input.nextInt();
					dll.InsertAtPosition(data0, position);
					System.out.println("Successfully insert data");
					System.out.println();
					break;
					
				case 3:
					int data1;
					System.out.println("Enter data : ");
					data1 = input.nextInt();
					dll.insertEnd(data1);
					System.out.println("Successfully insert data");
					System.out.println();
					break;
					
				case 4:
					dll.Traversing();
					System.out.println();
					break;
				
					
				case 5:
					System.exit(0);
					break;
				
				default:
					System.out.println("Invalid choice please select a valid choice");
					break;
			}
		}
	}
}