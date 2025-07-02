package Assignments;
class Single
{
	public void test1()
	{
		System.out.println("hello");
	}
}

public class SingleInheritance extends Single
{
	public static void main(String ar[])
	{
		SingleInheritance s1=new SingleInheritance();
		s1.test1();
	}

}
