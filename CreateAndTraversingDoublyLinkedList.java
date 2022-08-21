package database;
import java.util.*;
public class CreateAndTraversingDoublyLinkedList{
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data = data;
			this.prev = null;
			this.next = null;
		}
		
	}
	Node head;
	static Node tail = null;
	public void creation(int data) {
		if(head == null) {
			
		}
	}
	public void Traversing() {
		if(head == null) {
			System.out.println("Empty linked list");
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		CreateAndTraversingDoublyLinkedListll = new CreateAndTraversingDoublyLinkedList();
		ll.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);
		Node five = new Node(50);
		Node six = new Node(60);
		Node seven = new Node(70);
		Node eight = new Node(80);
		Node nine = new Node(90);
		Node ten = new Node(100);
		
		ll.head.prev = null;
		ll.head.next = second;
		
		second.prev = tail;
		second.next = third;
		
		third.prev = second;
		third.next = four;
		
		four.prev = third;
		four.next = five;
		
		five.prev = four;
		five.next = six;
		
		six.prev = five;
		six.next = seven;
		
		seven.prev = six;
		seven.next = eight;
		
		eight.prev = seven;
		eight.next = nine;
		
		nine.prev = eight;
		nine.next = ten;
		
		ten.prev = eight;
		ten.next = null;
		
		ll.Traversing();

	}
}
