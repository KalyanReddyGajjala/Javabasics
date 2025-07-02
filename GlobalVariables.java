package Module1Progroms;

public class GlobalVariables
{
	static int a=20;
	static int b=21;
	int c=a+b;
	static int d;
	int e;
	static String name;
	static double r;
	static char ch;
	static boolean bo;
	

	public static void main(String[] args)
	{
		
		System.out.println("a value="+a);
		System.out.println("b value="+b);
		a=222;
		System.out.println("a value="+a);
		GlobalVariables g1=new GlobalVariables();
		System.out.println("c value="+g1.c);
		g1.c=a-b;
		System.out.println("c value="+g1.c);
		System.out.println("d value="+d);
		System.out.println("e value="+g1.e);
		System.out.println("name value="+name);
		System.out.println("r value="+r);
		System.out.println("ch value="+ch);
		System.out.println("bo value="+bo);
		
		

	}

}
