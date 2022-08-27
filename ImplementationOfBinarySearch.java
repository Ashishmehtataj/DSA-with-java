package database;
import java.util.*;
public class ImplementationOfBinarySearch{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[10];
		int first,middle,last,i,search;

		System.out.print("Enter ten element in this array : ");
		for(i=0;i<10;i++) {
			array[i] = input.nextInt();
		}
		System.out.print("Enter item you want to Search : ");
		search = input.nextInt();
		first = 0;
		last = 9;
		middle = (first+last)/2;
		
		while(first<=last) {
			if(array[middle] <search) {
				first = middle+1;
			}else if(array[middle] == search) {
				System.out.println("Item found att location "+(middle+1));
				break;
			}else {
				last = middle-1;
				middle = (first+last)/2;
			}
		}
		
		if(first>last) {
			System.out.println("Item is not present in this array!!");
		}
	}
}

