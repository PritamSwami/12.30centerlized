package Pack1;

public class break_point {
	public void test()
	{
		System.out.println("One method");
	}
	public void test2(int a)
	{
		System.out.println("second method");
	}
	public void test3(int a,int b)
	{
		System.out.println("third method");
	}
	public void test4(int a,int b,int c)
	{
		System.out.println("forth method");
	}
	public static void main(String[] args) {
		break_point val=new break_point();
		val.test();
		val.test2(33);
		val.test3(22, 25);
		val.test4(44, 55, 66);
		
	}

}
