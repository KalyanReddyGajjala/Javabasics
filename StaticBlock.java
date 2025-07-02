package Module1Progroms;

class StaticBlock
{
	static
	{
		System.out.println("hello");
	}
	{
		System.out.println("IIB");
	}
	 StaticBlock()
	{
		int a=10;
		System.out.println("Constructor"+a);
	}
public static void main(String ar[])
	{
		StaticBlock b1=new StaticBlock();
		
	}
	
}

