package Module1Progroms;

class Feature1
{
	void login()
	{
		System.out.println("hello");
	}
}
public class MethodOverriding1 extends Feature1
{
	void login()
	{
		super.login();
		System.out.println("hi");
		
	}

	public static void main(String[] args) 
	{
		MethodOverriding1 m1=new MethodOverriding1();
		
		m1.login();

	}

}
