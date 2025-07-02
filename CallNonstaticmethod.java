package Assignments;
class NonStatic
{
	public void test()
	{
		System.out.println("hello");
	}
}

public class CallNonstaticmethod 
{
	public static void main(String ar[])
	{
NonStatic n1=new NonStatic();
n1.test();
}
}