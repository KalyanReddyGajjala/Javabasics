package Assignments;

public class NonStaticParameter 
{
	public void test(int a)
	{
		System.out.println("test"+a);
	}
	public void test2(double b)
	{
		System.out.println("test"+b);
	}
	public void test3(int c)
	{
		System.out.println("test"+c);
	}

public static void main(String ar[])
	{
	NonStaticParameter n1=new NonStaticParameter();
		n1.test(2);
		n1.test2(2.6);
		n1.test3(23);
	}

}

