package Module1Progroms;
abstract interface one
{
	void login();
	void logout();
	abstract void reset();
	static void red()
	{
		System.out.println("helo");
	}
	
}
interface two extends one
{
	void hello();
}


public class Interface implements two
{

	
	public void hello() {
		System.out.println("hello");
		
	}

	public void login() {
		
		System.out.println("login");
	}

	
	public void logout() {
	
		System.out.println("logout");
	}

	
	public void reset() {
		System.out.println("reset");
		
	}
	public static void main(String ar[])
	{
		Interface i1=new Interface();
		i1.hello();
		i1.login();
		i1.logout();
		i1.reset();
		
	}

}
