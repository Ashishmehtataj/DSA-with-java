import java.util.*;
class CreateAndTraversingSinglyLinkedList{
	Node head;
	static class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public void Traversing(){
		if(head==null){
			System.out.print("Empty linked list");
			return;
		}else{
			Node temp = head;
			System.out.print("Linked list is : ");
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	public static void main(String[] args) {
		CreateAndTraversingLinkedList list = new CreateAndTraversingLinkedList();
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

		list.Traversing();
	}
}