package Assignments;
class Hai
{
	public void test()
	{
		System.out.println("test");
	}
}
class Hello extends Hai
{
	public void test1()
	{
		System.out.println("test1");
	}
}
class Helo extends Hai
{
	public void test2()
	{
		System.out.println("test1");
	}
}
class HelloSingle extends Helo
{
	public void test3()
	{
		System.out.println("test1");
	}
}

public class HierarchicalLevelInheritance extends HelloSingle
{
public static void main(String ar[])
{
	Hello h1=new Hello();
	h1.test();
	h1.test1();
	Helo h2=new Helo();
	h2.test();
	h2.test2();
	HelloSingle h3=new HelloSingle();
	h3.test();
	h3.test2();
	h3.test3();
}
}
