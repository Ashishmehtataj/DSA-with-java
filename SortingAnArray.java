import java.util.*;
class SortingAnArray{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int noe;
		System.out.print("Enter how many number in this array : ");
		noe = input.nextInt();
		int array[] = new int[noe];
		for(int i=0;i<noe;i++){
			array[i] = input.nextInt();
		}
		System.out.print("Unsorted Array : ");
		show(array,noe);
		System.out.println("Sorted Array : ");
		sort(array,noe);
		show(array,noe);
	}
	public static void sort(int array[],int noe){
		int i,j,temp;
		for(i = 0;i<noe;i++){
			for(j = i+1;j<noe;j++){
				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	public static void show(int array[],int noe){
		for(int i=0;i<noe;i++){
			System.out.print(array[i]+" ");
		}
	}
}