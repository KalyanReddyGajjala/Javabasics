package Assignments;
//32 program
public class ThisCallingStatement
{
	ThisCallingStatement(int a)
	{
		System.out.println("a value is="+a);
		
	}
	ThisCallingStatement(double b)
	{
		this(23);
		System.out.println("b value is="+b);
		
	}
	public static void main(String ar[])
	{
		ThisCallingStatement th1=new ThisCallingStatement(2.4);
		
	}
}


