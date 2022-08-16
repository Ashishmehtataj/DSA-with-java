import java.util.*;
class second{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.println("Enter "+size+" elements in this array : ");
		for(int i=0;i<size;i++){
			array[i] = input.nextInt();
		}
		System.out.print("Array elements is : ");
		for(int i=0;i<size;i++){
			System.out.print(array[i]+" ");
		}
	}
}