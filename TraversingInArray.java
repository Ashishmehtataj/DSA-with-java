
import java.util.*;
public class TraversingInArray{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		System.out.println("Enter how many elements in this array : ");
		size = input.nextInt();
		int array[] = new int[size];
		System.out.print("Enter "+size+" elements in this array : ");
		for(int i=0;i<size;i++) {
			array[i] = input.nextInt();
		}
		System.out.print("Array Traversing is : ");
		Traversing(array,size);
		
	}
	public static void Traversing(int array[],int size) {
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
