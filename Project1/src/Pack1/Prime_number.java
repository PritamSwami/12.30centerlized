package Pack1;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		boolean value = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int x = sc.nextInt();
		
	    for (int i = 2; i <= x / 2; ++i) {
	     
	      if (x % i == 0) {
	        value = true;
	      }
	    }

	    if (!value)
	      System.out.println(x + " is a prime number.");
	    else
	      System.out.println(x + " is not a prime number.");
	}
}
