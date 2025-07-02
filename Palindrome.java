package Module1Progroms;

public class Palindrome 
{
	public static void main(String ar[])
	{
	String input="madam";
	String output="";
	
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			output=output+c;
		}
		System.out.println(output);
		if(input.equals(output)) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	

}
