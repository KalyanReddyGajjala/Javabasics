package Assignments;
class Super3
{
	Super3(int a)
	{
		System.out.println("a value is="+a);
	}
}

class Super4 extends Super3
{
	Super4(double b)
	{
		super(21);
		System.out.println("b value is="+b);
	}
}
public class ParameterizedSuperCallingStatement 
{
	public static void main(String ar[])
	{
		Super4 s1=new Super4(2.5);
	}

}
