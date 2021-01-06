package Pack1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		 int a,sum=0,temp; 
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the value of x");
	        int x = sc.nextInt();
		    temp=x;    
		    while(x>0){    
		     a=x%10;  
		   sum=(sum*10)+a;    
		   x=x/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}

}
