package Module1Progroms;
class Amazon
{
	Amazon()
	{
		System.out.println("login to Amazon");
	}
}
class Amazon1 extends Amazon
{
	Amazon1(String UserName)
	{
		
		System.out.println("UserName="+UserName);

	}
	Amazon1(int password)
	{
	
		System.out.println("password="+password);

	}
}

public class ConstructorInheritance extends Amazon1
{
	ConstructorInheritance()
	{
		super("kalyan");
		
		
		}
	public static void main(String ar[])
	{
		new ConstructorInheritance();
	}
}
