import java.util.*;
public class Insertion{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int noe = input.nextInt();
		int array[] = new int[noe];
		int array1[] = new int[noe+1];
		System.out.print("Enter values");
		for(int i=0;i<noe;i++){
			array[i] = input.nextInt();
		}

		int index,data;
		System.out.print("Enter data you want to enter : ");
		data = input.nextInt();
		System.out.print("Enter index you want to enter data : ");
		index = input.nextInt();

		System.out.print("Original array : ");
		for(int i=0;i<noe;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	
			for(int i=0;i<noe+1;i++) {
				if(i<index) {
					array1[i] = array[i];
				}else if(i==index) {
					array1[i] = data;
				}else {
					array1[i] = array[i-1];
				}
			}
			
		System.out.print("New array is : ");
		for(int i=0;i<noe+1;i++){
			System.out.print(array1[i]+" ");
		}
	
}
}