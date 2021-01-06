package Pack1;

public  class roomtwo extends roomone {
	public void table()
	{
		System.out.println("this is my second class");
	}
	public static void main(String[] args) {
		roomtwo ref_value = new roomtwo();
		ref_value.table();
		ref_value.blackboard();
	}
	

}
