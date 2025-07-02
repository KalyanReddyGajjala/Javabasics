package Module1Progroms;

public class Array2
{
	public static void main(String ar[])
	{
		String input="auto";
		String output="";
		for(int i=0;i<input.length();i++)
		{
			char c1=input.charAt(i);
			//char c[]=c1.toCharArray();
			output=output+c1;
		}
		System.out.println(output);
	}

}
