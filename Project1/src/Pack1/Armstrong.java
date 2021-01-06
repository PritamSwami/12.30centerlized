package Pack1;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		  
		 int a,sum=0,temp; 
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the value of x");
	        int x = sc.nextInt();
		    temp=x;    
		    while(x>0){ 
		     a=x%10;  
		     x=x/10;
		    
		   sum=sum+(a*a*a);    
		       
		  }    
		  if(temp==sum)    
		   System.out.println("Armstrong number ");    
		  else    
		   System.out.println("not Armstrong number");    
	}
}
