package Module1Progroms;

import java.util.Scanner;

public class ScanDemo1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter r value");
		double r=sc.nextDouble();
		double area=Math.PI*r*r;
		System.out.println("area of circle="+area);

	}

}
