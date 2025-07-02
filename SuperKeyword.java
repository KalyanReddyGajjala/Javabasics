package Assignments;

 class SuperKeyword1
{
	void login()
	{
		System.out.println("hello");
	}

}
public class SuperKeyword extends SuperKeyword1
{
	
	void login()
	{
		super.login();
		System.out.println("hi");
		
	}

	public static void main(String[] args) 
	{
		SuperKeyword m1=new SuperKeyword();
		m1.login();

	}

}
