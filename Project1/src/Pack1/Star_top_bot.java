package Pack1;

import java.util.Scanner;

public class Star_top_bot {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter value for row and colomn ");
		int row = sc.nextInt();
		for(i=0; i<row; i++) 
		{
			for(j=0; j<=i; j++)   
			{   
			//prints stars   
			System.out.print("* ");   
			} 
			System.out.println(); 
		}
	}

}
