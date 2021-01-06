package Pack1;

import java.util.Scanner;

public class triangle_val {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter value for row and colomn ");
		int row = sc.nextInt();
		for(i=1; i<=row; i++) 
		{
			for(j=1; j<=i; j++)   
			{   
			//prints stars   
			System.out.print(j);
				
			} 
			System.out.println(); 
		}
	}
}
