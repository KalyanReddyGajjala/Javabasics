package Module1Progroms;
abstract class Google
{
	abstract void login();
	abstract void logout();
	
}

public class Createabstract extends Google
{
	public static void main(String ar[])
	{
		Createabstract c1=new Createabstract();
		c1.login();
		c1.logout();
	}
	void login()
	{
		System.out.println("login");
		
	}
	void logout()
	{
		System.out.println("logout");
	}

}
