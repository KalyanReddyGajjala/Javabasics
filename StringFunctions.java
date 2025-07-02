package Module1Progroms;

public class StringFunctions 
{
	public static void main(String ar[])
	{
		String a="Automation";
		int a1=a.length();
		System.out.println(a1);
		String a2=a.toUpperCase();
		System.out.println(a2);
		String a3=a.toLowerCase();
		System.out.println(a3);
		boolean b=a.equals("automation");
		System.out.println(b);
		boolean b1=a.equalsIgnoreCase("automation");
		System.out.println(b1);
		char c=a.charAt(0);
		System.out.println(c);
		int c1=a.indexOf('t');
		System.out.println(c1);
		String s=a.concat("testing").concat(a3);
		System.out.println(s);
		String s1=a.substring(2);
		System.out.println(s1);
		String s2=a.substring(2,7);
		System.out.println(s2);
		boolean s3=s.contains("testing");
		System.out.println(s3);
	}

}
