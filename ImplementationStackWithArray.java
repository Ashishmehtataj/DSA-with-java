package database;
import java.util.*;
public class ImplementationStackWithArray{
	int noe=100;
	int stack[] = new int[noe];
	int i,top=-1;
	
	public void push(int data) {
		if(top==noe) {
			System.out.println("Overflow");
		}else {
			top = top+1;
			stack[top] = data;
		}
			
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Empty Stack");
		}else {
			top = top-1;
		}
	}
	
	public void Traversing() {
		if(top==-1) {
			System.out.println("Empty stack");
		}else {
			System.out.print("Stack element is : ");
			for(int i=top;i>=0;i--) {
				System.out.print(stack[i]+" ");
			}
		}
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Stackarray s = new Stackarray();
//		System.out.println("Enter how many elements in this stack");
//		noe = input.nextInt();
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
				s.push(data);
				System.out.println("Data insert successfully");
				System.out.println();
				break;
			
			case 2:
				s.pop();
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
