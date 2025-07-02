package Assignments;
class Super1
{
	public  Super1()
	{
		System.out.println("super1");
	}
}
class Super2 extends Super1
{
	
	public  Super2()
	{
		super();
		System.out.println("super2");
		
	}
}

public class SuperCallingStatement extends Super2
{
public static void main(String ar[])
{
	SuperCallingStatement s1=new SuperCallingStatement();
	
}
}
