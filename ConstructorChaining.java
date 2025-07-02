package Module1Progroms;

public class ConstructorChaining 
{
	ConstructorChaining(int a)
	{
		
		System.out.println("a value="+a);
	}
	ConstructorChaining(double b)
	{
		this(2);
		System.out.println("b value="+b);
	}
	ConstructorChaining(String c)
	{
		this(10.5);
		System.out.println("c avalue="+c);
	}
	public static void main(String[] args) 
	{
		new ConstructorChaining("kalyan");
		

	}

}
