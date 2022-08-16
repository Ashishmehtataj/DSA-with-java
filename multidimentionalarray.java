import java.util.*;
class second{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row,col;
		System.out.print("Enter  how many rows in this array : ");
		row = input.nextInt();
		System.out.print("Enter how many cols in this array : ");
		col = input.nextInt();
		int array[][] = new int[row][col];
		System.out.println("Enter "+row*col+" elements in this array : ");
		for(int i=0;i<row;i++){
			for (int j=0; j<col;j++ ) {
							array[i][j] = input.nextInt();
			}
		}
		System.out.println("multidimentional array is : ");

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(array[i][j]+" ");
			}System.out.println();	
		}
		
	}
}