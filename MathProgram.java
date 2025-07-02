package Assignments;

//Assignment 29 and 30 , 33 programs
interface Operators1
{
	public void add();
	public void sub();
	public void multi();
	public void min();
	public void max();
	public void abs();
	public void random();
	public void PI();
	
}

public class MathProgram implements Operators1
{
	public void add()
	{
		int a=java.lang.Math.addExact(1, 2);
		System.out.println(a);
	}
	public void sub()
	{
		int b=java.lang.Math.subtractExact(2, 5);
		System.out.println(b);	
	}
	public void multi()
	{
		int c=java.lang.Math.multiplyExact(5, 10);
		System.out.println(c);
	}
	public void min()
	{
		int d=java.lang.Math.min(25, 30);
		System.out.println(d);
	}
	public void max()
	{
		int e=java.lang.Math.max(20, 40);
		System.out.println(e);
	}
	public void abs()
	{
		double f=java.lang.Math.abs(25.9);
		System.out.println(f);
	}
	public void random()
	{
		double g=java.lang.Math.random();
		System.out.println(g);
	}
	public void PI()
	{
		double h=java.lang.Math.PI;
		System.out.println(h);
	}
	public static void main(String ar[])
	{
		MathProgram m1=new MathProgram();
		m1.add();
		m1.sub();
		m1.multi();
		m1.min();
		m1.max();
		m1.abs();
		m1.random();
		m1.PI();
	}
	
}

