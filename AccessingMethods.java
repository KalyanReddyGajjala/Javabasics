package Module1Progroms;

public class AccessingMethods
{
	public void test()
	{
		System.out.println("package Module1Progroms;public method");
	}
	protected void test1()
	{
		System.out.println("package Module1Progroms;protected method");
	}
	public static void main(String ar[])
	{
		AccessingMethods a1=new AccessingMethods();
		a1.test();
		a1.test1();
	}

}
