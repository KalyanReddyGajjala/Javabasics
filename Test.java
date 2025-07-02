package Assignments;

public class Test
{
	public static void main(String ar[])
	{
		int [] a= {1,2,3,4};
		int [] b=new int[a.length];
		for(int i = 0; i < a.length; i++)
		{
		b[i]=a[a.length-1-i];
		System.out.println(b[i]);
		}
		//System.out.println(b[i]);
		
	}

}
