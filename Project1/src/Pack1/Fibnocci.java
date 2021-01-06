package Pack1;

import java.util.Scanner;

public class Fibnocci {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a value Of x");
		int x= sc.nextInt();
		 int a=0,b=1,c,i;    
		 System.out.print(a+" "+b);   
		    
		 for(i=2;i<x;++i)    
		 {    
		  c=a+b;    
		  System.out.print(" "+c);    
		 a=b;    
		  b=c;    
		 }    
	}

}
