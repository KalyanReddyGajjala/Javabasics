package Assignments;

//Assignment 34
abstract class Five
{
	public abstract void login();
	public abstract void logout();
}

public  class FivityPerAbstraction extends Five
{
	public void login()
	{
		System.out.println("login successfull");
	}
	public  void logout()
	{
		
	}
	public static void main(String ar[])
	{
		FivityPerAbstraction f1=new FivityPerAbstraction();
		f1.login();
	}

}
