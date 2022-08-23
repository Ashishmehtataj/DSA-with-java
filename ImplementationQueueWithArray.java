

import java.util.Scanner;

 class ImplementationQueueWithArray {
	int maxsize=10;
	int queue[] = new int[maxsize];
	int front = -1,rear = -1;
	
	void enqueue(int data) {
		if(rear == (maxsize-1)) {
			System.out.println("Overflow");
		}else {
			if(front==-1 && rear == -1) {
				front = 0;
				rear = 0;
				queue[rear]  = data;
			}else {
				rear = rear+1;     
				queue[rear] = data;
			
			}
		}
	}
	
	void dequeue() {
		if(front==-1 && rear == -1) {
			System.out.println("Underflow");
		}else {
			front = front+1;
		}
	}
	void Traversing() {
		if(front==-1 && rear == -1) {
			System.out.println("Empty Queue");
		}else {
			for(int i=front;i<=rear;i++) {
				System.out.println(queue[i]+"");
			}
		}

	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ImplementationQueueWithArray s = new ImplementationQueueWithArray();
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
				s.dequeue();
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
