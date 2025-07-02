package Assignments;
class Methods
{
	public static void test()
	{
		System.out.println("static context");
	}
	public void test1()
	{
		System.out.println("nonstatic context");
	}
}

public class StaticAndNonStatic
{
	public static void main(String ar[])
	{
	Methods.test();
	Methods m1=new Methods();
	m1.test1();
	}
}
