import java.util.NoSuchElementException;
import java.util.*;
import database.DLL.Node;

public class DeletionWithConditionInDoublyLinkedList{
	
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
	}	public int length() {
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
	public void delete() {
		int data,n,m,p;
		Scanner input = new Scanner(System.in);
		do {
			if(head == null) {
				System.out.println("Empty linked list");
			}else {
				System.out.println("Enter 1 for Delete First\nEnter 2 for Delete position \nEnter 3 for Delete at end");
				m = input.nextInt();
				switch(m) {
				case 1:
					ListNode temp = head;
					temp = temp.next;
					head=temp;
					head.previous = null;
					break;
				
				case 2:
					System.out.println("Enter position : ");
					p = input.nextInt();
					ListNode temp2 = head;
					ListNode ptr1 = temp2.next;
					for(int i=1;i<p-1;i++) {
						temp2  = ptr1;
						ptr1  = ptr1.next;
					}
					temp2.next = ptr1.next;
					ptr1.next.previous = temp2; 
					break;
				
				case 3:
					ListNode temp1 = head;
					temp1 = temp1.previous;
					temp1.next = null;
					break;
					
				}
			}
			System.out.println("if you want to delete more than press 1");
			n = input.nextInt(); 
		}while(n==1);
	}
public static void main(String[] args) {
		DeletionWithConditionInDoublyLinkedListdll = new DeletionWithConditionInDoublyLinkedList();
		dll.insertFirst(1);
		dll.insertFirst(2);
		dll.insertFirst(3);
		dll.insertFirst(4);
		dll.insertFirst(5);
		dll.Traversing();
		System.out.println();
		dll.delete();
		dll.Traversing();
//		dll.InsertAtPosition(7,2);
//		dll.displayForward();

//		dll.deleteLast();
//		dll.deleteLast();

//		
		}
	}