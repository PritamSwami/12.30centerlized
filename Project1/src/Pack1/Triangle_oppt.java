package Pack1;

import java.util.Scanner;

public class Triangle_oppt {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter value for row and colomn ");
		int row = sc.nextInt();
		for(i=row-1; i>=0; i--)
		
		{
			for (j=0; j<=i; j++)  
			{  
			//prints star and space  
			System.out.print("*" + " ");  
			}  
			//throws the cursor in the next line after printing each line  
			System.out.println();  
		}
	}
	

}
