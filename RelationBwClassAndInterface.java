package Assignments;
//Assignment 38
interface Gmail
{
	public void login();
	public void logout();
}
interface LinkedIn extends Gmail
{
	public void enterMOB();
	public void enterPassword();
}
interface Enter extends LinkedIn
{
	public void submit();
}


public class RelationBwClassAndInterface implements Enter
{
	public void login()
	{
		System.out.println("login successful");
	}
	public void logout()
	{
		System.out.println("logout successful");
	}
	public void enterMOB() {
		System.out.println("enter mobile number");
	}
	public void enterPassword()
	{
		System.out.println("Enter password");
	}
	public void submit()
	{
		System.out.println("submit");
	}
	public static void main(String ar[])
	{
		RelationBwClassAndInterface r1=new RelationBwClassAndInterface();
		r1.login();
		r1.logout();
		r1.enterMOB();
		r1.enterPassword();
		r1.submit();
	}
}
