package database;
import java.util.*;
public class CreateAndTraversingCircularSinglyLinkedListNode{
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.next = null;
			this.data  = data;
		}
	}
	static Node head = null;
	
	public void Traversing() {
		if(head==null) {
			System.out.println("Empty linked list");
		}else {
			Node temp = head;
			do {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}while(temp!=head);
		}
	}
	public void Insert
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CreateAndTraversingCircularSinglyLinkedListNodes = new CreateAndTraversingCircularSinglyLinkedListNode();
		s.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);
		Node five = new Node(50);

		
		s.head.next = second;
		second.next = third;
		third.next = four;
		four.next = five;
		five.next = head;
		
		s.Traversing();
		
	}
}
