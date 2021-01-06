package Pack1;

import java.util.Scanner;

public class loop_triangle {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter value for row ");
		int row = sc.nextInt();
		int k=1;
		for(i=1; i<=row; i++) 
		{
			for(j=1; j<=i; j++)   
			{   
			//prints stars   
			//System.out.print(j);
				System.out.print(k++ +" ");
				
			} 
			System.out.println(); 
		}
	}

}
