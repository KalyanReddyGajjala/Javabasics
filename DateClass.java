package Module1Progroms;

import java.util.Date;

public class DateClass 
{
	public static void main(String ar[])
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime()+(1000*60*60*24*3));
		System.out.println(d2);
		//d2 convert into toString
		String format=d2.toString();
		String date=format.substring(8,10);
		System.out.println(date);
		String month=format.substring(4,7);
		System.out.println(month);
		String year=format.substring(format.length()-4);
		System.out.println(year);
		String format1=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format1);
		String format2=date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format2);
	}

}
