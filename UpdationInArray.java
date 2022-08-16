package database;
import java.util.*;
class UpdationInArray {
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
		int newdata,index;
		System.out.println("Enter new data you want to update : ");
		newdata = input.nextInt();
		System.out.println("Enter index you want to update new data in array : ");
		index = input.nextInt();
		System.out.println("Original Array : ");
		Traversing(array,size);
		Updation(array,size,newdata,index);
		System.out.println("New Array : ");
		Traversing(array,size);
		
	}
	public static void Traversing(int array[],int size) {
		for(int i=0;i<size;i++) {
			System.out.println(array[i]+" ");
		}
	}
	public static void Updation(int array[],int noe,int newdata,int index) {
		
			array[index] = newdata;
		
	}
}
