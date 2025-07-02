package Module1Progroms;

public class AmazonConstructor
{
	AmazonConstructor()
	{
		System.out.println("Constructor");
	}
	AmazonConstructor(int a , int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		AmazonConstructor ac=new AmazonConstructor();
		AmazonConstructor ac1=new AmazonConstructor(3,90);
		

	}

}
