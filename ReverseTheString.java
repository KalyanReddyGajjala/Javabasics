package Module1Progroms;

public class ReverseTheString 
{
	public static void main(String ar[])
	{
		String input="KalyanReddy";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			output=output+c;
			//output=output.concat(String.valueOf(c));
			
		}
		System.out.println(output);
	}

}
