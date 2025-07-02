package Module1Progroms;

import java.util.Scanner;

public class ScanT 
{
	static void are_of_circle()
	{
		System.out.println("Enter the value of r");
		
			Scanner sc1=new Scanner(System.in);
			double r=sc1.nextDouble();
			System.out.println("find of area");
			double area=Math.PI*r*r;
			System.out.println("area="+area);
		
	}
	static void circumference_of_circle()
	{
		System.out.println("Enter the value of r");
		
			Scanner c1=new Scanner(System.in);
			double r=c1.nextDouble();
			System.out.println("find of circumference");
			double circumference=2*Math.PI*r*r;
			System.out.println("circum="+circumference);
			c1.close();
		
	}
	static void circumference_of_rectangle()
	{
		
			Scanner c1=new Scanner(System.in);
			System.out.println("find of circumference");
			int circum=2*Math.addExact(20,10);
			System.out.println(circum);
			c1.close();
		
	}
	static void area_of_rectangle()
	{
		
			//Scanner c2=new Scanner(System.in);
			//System.out.println("find value of n");
			//long n=c2.nextLong();
			System.out.println("find area of rectangle");
			long rectangleArea=Math.multiplyExact(10, 50);
			System.out.println("rect="+rectangleArea);
			//c2.close();
		
	}
	public static void main(String[] args)
	{
		are_of_circle();
		circumference_of_circle();
		circumference_of_rectangle();
		area_of_rectangle();
	}

}
