package Pack1;

import java.util.Scanner;

public class classone {
	public int add (int a,int b) {
		int c;
		c=a+b;
		//System.err.println("result of addition "+ c);
		return c;
	}
	
		public int sub (int a,int b) {
			int c;
			c=a-b;
			//System.err.println("result of Sub "+ c);
			return c;
		}
	
			public int mult (int a,int b) {
				int c;
				c=a*b;
				//System.err.println("result of multiplication "+ c);
				return c;
			}
				public void div (int a,int b) {
					int c;
					c=a/b;
					System.out.println("Result after all operation = " + c);
				}
               public static void main(String[] args) {
            	   Scanner ref_value=new Scanner(System.in);
            	   classone class_value=new classone();
            	   System.out.println("Please Enter Value Of a");
            	  int a_add= ref_value.nextInt();
            	  System.out.println("Please Enter Value Of B");
            	  int B_add= ref_value.nextInt();
            	int additon_one=  class_value.add(a_add,B_add);
            	 System.out.println("Value after Addition = "+ additon_one );
            	 System.out.println("Please Enter a Value for sub");
           	  int B= ref_value.nextInt();
           	int subtraction=class_value.sub(additon_one, B);
            System.out.println("Value after subtraction = "+ subtraction );
           	System.out.println("Please Enter a Value for mult");
        	  int B_mult= ref_value.nextInt();
        	 int multiplicaion = class_value.mult(subtraction, B_mult);
        	 System.out.println("Value after multiplicaion = "+ multiplicaion );
        	 System.out.println("Please Enter a Value again for addition");
        	  int B_addition= ref_value.nextInt();
        	 int result_new_add=class_value.add(multiplicaion, B_addition);
        	 System.out.println("Value after re addition = "+ result_new_add );
           	System.out.println("Please Enter a Value for division");
           	 int B_division= ref_value.nextInt();
        	 class_value.div(result_new_add, B_division);
           	  
            	  
	
}

}
