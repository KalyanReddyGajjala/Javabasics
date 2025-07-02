package Assignments;
class Nonstatict
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
}
	public class NonstaticDifferent
	{
	public static void main(String ar[])
	{
		Nonstatict n1=new Nonstatict();
		n1.test(2);
		n1.test2(2.6);
		n1.test3(23);
	}

}
