package Assignments;
//Assignment 39
abstract class Eight
{
	public abstract void test();
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	static void add()
	{
		int a=20;
		int b=20;
		int c=a+b;
		System.out.println("c="+c);
	}
	
}

public class EightPerAbstraction extends Eight
{
	public  void test() {
		System.out.println("test method");
	}
	public  void test1()
	{
		System.out.println("test1 method");
	}
	public  void test2() {
		System.out.println("test2 method");
	}
	public  void test3() {
		System.out.println("test3 method");
	}
	public static void main(String ar[])
	{
		EightPerAbstraction e1=new EightPerAbstraction();
		e1.test();
		e1.test1();
		e1.test2();
		e1.test3();
		add();
	}
}
