import java.util.*;
public class ImplementationOfLinearSearch{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[10];
		System.out.print("Enter ten element in this array : ");
		for(int i=0;i<10;i++) {
			array[i] = input.nextInt();
		}
		System.out.print("Enter item you want to Search : ");
		int item = input.nextInt();
		int i=0;
		while(i<10) {
			if(array[i] == item) {
				System.out.println("Item found at location : "+(i+1));
				break;
			}
			i++;
		}
		if(i>=10) {
			System.out.println("Item is not present in this array");
		}
	}
}
