package Pack1;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, fact=1;
		System.out.println("Please Enter a value for a factorial");
		int x = sc.nextInt();
		for(i=1;i<=x; i++) 
		{
			fact=fact*i;
		}
		System.out.println("Factorial = "+fact); 
	}

}
