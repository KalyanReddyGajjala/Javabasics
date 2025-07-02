package Assignments;
//Assignment 35
interface Facebook
{
	public void login();
	public void logout();
}
interface Instagram
{
	public void login();
	public void logout();
}
public class MultipleInheritance implements Facebook,Instagram
{
	public void login()
	{
		System.out.println("login successful");
	}
	public void logout()
	{
		System.out.println("logout successful");
	}
public static void main(String ar[])
{
	MultipleInheritance m1=new MultipleInheritance();
	m1.login();
	m1.logout();
}
}
