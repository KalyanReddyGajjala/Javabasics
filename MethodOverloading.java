package Module1Progroms;

public class MethodOverloading 
{
	static void add()
	{
		System.out.println("MethodOverLoading");
	}
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(int a,double b, long c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) 
	{
	add();
	add(2,10);
	MethodOverloading ml=new MethodOverloading();
	ml.add(3,20.4,1234567l);
	

	}

}
