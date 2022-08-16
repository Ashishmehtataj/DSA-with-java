import java.util.*;
class SearchingInArray{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many elements in this array : ");
		int noe = input.nextInt();
		int array[] = new int[noe];
		System.out.print("Enter "+noe+" in this array : ");
		for(int i=0;i<noe;i++){
			array[i] = input.nextInt();
		}
		int value;
		System.out.print("Enter value to find in array : ");
		value = input.nextInt();
		Search(array,noe,value);
	}
	public static void Search(int array[],int noe,int value){
		int flag=0,i=0;
		for(i=0;i<noe;i++){
			if(array[i] == value){
				flag =1;
				break;
			}else{
				flag = 0;
			}
		}
		if(flag==1){
			System.out.print("Element possition is "+(i+1));
		}else{
			System.out.print("Element is not available");
		}
	}
}