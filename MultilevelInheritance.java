package Assignments;
class Multilevel
{
	public void test()
	{
		System.out.println("test");
		
	}
}
class Multilevel1 extends Multilevel
{
	public void test1()
	{
		System.out.println("test1");
	}
}

public class MultilevelInheritance extends Multilevel
{
	public static void main(String ar[])
	{
		Multilevel1 l1=new Multilevel1();
		l1.test();
		l1.test1();
		 MultilevelInheritance m=new  MultilevelInheritance();
		 m.test();
	}

}
