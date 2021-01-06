package Pack1;

public class keyword {
	static int testing;
	public void increment()
	{
		testing=testing+1;
	}
	public static void main(String[] args) {
		System.out.println("output of first object first time");
		keyword new_ref1=new keyword();
		new_ref1.increment();
		System.out.println("output=" + new_ref1.testing);
		System.out.println("output of first object second time");
		new_ref1.increment();
		System.out.println("output=" + new_ref1.testing);
		System.out.println("output of first object third time");
		new_ref1.increment();
		System.out.println("output=" + new_ref1.testing);
		
		System.out.println("output of Second object first time");
		keyword new_ref2=new keyword();
		new_ref2.increment();
		System.out.println("output=" + new_ref2.testing);
		System.out.println("output of second object second time");
		new_ref2.increment();
		System.out.println("output=" + new_ref2.testing);
		System.out.println("output of second object third time");
		new_ref2.increment();
		System.out.println("output=" + new_ref2.testing);
		System.out.println("output of third object first time");
		keyword new_ref3=new keyword();
		new_ref3.increment();
		System.out.println("output=" + new_ref3.testing);
		System.out.println("output of third object second time");
		new_ref3.increment();
		System.out.println("output=" + new_ref3.testing);
		System.out.println("output of third object third time");
		new_ref3.increment();
		System.out.println("output=" + new_ref3.testing);
	}

}
