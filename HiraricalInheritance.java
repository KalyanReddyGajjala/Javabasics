package Module1Progroms;
class FaceBook
{
static void login()
{
	System.out.println("Login Successful");
}
static void logout()
{
	System.out.println("Logout Successful");
}
}
class Videos extends FaceBook
{
	static void watchVideo()
	{
		System.out.println("watch Videos");
	}
}

public class HiraricalInheritance extends Videos
{
static void message()
{
	System.out.println("Text Message");
}
public static void main(String ar[])
{
	login();
	watchVideo();
	message();
	logout();
	
}
}
