package Module1Progroms;

import java.util.Arrays;

public class StringChar {

	public static void main(String[] args) 
	{
		String s1="shalini";
		String s3 = "";
		char[] reversedstr=s1.toCharArray();
		String s4= Arrays.toString(reversedstr);
		//System.out.println(reversedstr);
		System.out.println(Arrays.toString(reversedstr));
		for(int i=s4.length()-1;i>=0;i--)
		{
			
			
			
		char c1=s4.charAt(i);
			//String c2=c1.toString();
			//System.out.println(s4[i]);
		    //String s2=reversedstr.toString();
		  //  System.out.println(s2);
		    s3=s3.concat(String.valueOf(c1));
		  
		}
		System.out.println(s3);
		
}
}
