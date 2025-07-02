package Module1Progroms;
abstract class Google1
{
	abstract void login();
	abstract void logout();
	static void twoway()
	{
		System.out.println("twoway");
	}
	void reset()
	{
		System.out.println("reset");
	}
	
}
abstract class Linkedin extends Google1
{
	void login()
	{
		System.out.println("login");
	}
}

public class Createabstract1 extends Linkedin
{
	public static void main(String ar[])
	{
twoway();
Createabstract1 c1=new Createabstract1();
c1.login();
c1.logout();
c1.reset();
    }

	
	void logout() {
		System.out.println("logout");
		
	}
	void reset()
	{
		System.out.println("erset1");
	}
	}
	
