package Module1Progroms;

public class NonStaticMemberOfSameClass
{
	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	void sub()
	{
		int a=10;
		int b=20;
		System.out.println(a-b);
	}

	public static void main(String[] args) 
	{
		
		NonStaticMemberOfSameClass c1= new NonStaticMemberOfSameClass();
		c1.add();
		c1.sub();

	}

}
