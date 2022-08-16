import java.util.*;
class Deletion{
	public static void main(String[] args) {
		int size;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many elements in this array : ");
		size = input.nextInt();	
		int array[] = new int[size];
		System.out.print("Enter "+size+" elements in this array : ");
		for(int i=0;i<size;i++){
			array[i] = input.nextInt();
		}
		int index;
		System.out.print("Enter index you want to delete data : ");
		index = input.nextInt();
		System.out.print("Original array is : ");
		show(array,size);
		System.out.println();
		delete(array,size,index);
		size--;
		
		
		System.out.print("New array is : ");
		show(array,size);

	}
	public static void delete(int array[],int size,int index){
		while(index<size){
			array[index-1] = array[index];
			index++;

		}
	}
	public static void show(int array[],int size){
		for(int i=0;i<size;i++){
			System.out.print(array[i]+" ");
		}
	}
}