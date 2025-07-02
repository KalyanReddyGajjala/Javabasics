package Assignments;

public class AndOrOperator {

	public static void main(String[] args)
	{
		String userName="kalyan";
		String password="123456";
		if(userName=="kalyan" && password=="123456")
		{
			System.out.println("floderUnlocked");
		}
		else
		{
			System.out.println("Enter correct username and password");
		}
		if(userName=="kalyan" || password=="1234")
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("Enter correct UserName/Password ");
		}
		
		

	}

}
