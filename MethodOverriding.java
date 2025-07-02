package Module1Progroms;
class Feature
{
	void login()
	{
		System.out.println("hello");
	}
}
public class MethodOverriding 
{
	void login()
	{
		System.out.println("hi");
	}

	public static void main(String[] args) 
	{
		MethodOverriding m1=new MethodOverriding();
		m1.login();

	}

}
