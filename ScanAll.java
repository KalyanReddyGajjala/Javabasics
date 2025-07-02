package Module1Progroms;

import java.util.Scanner;

public class ScanAll {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Area of Rectangle");
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		int AreaOfRectangle=a*b;
		System.out.println("AreaOFRectangle="+AreaOfRectangle);
		System.out.println("Circumfernce of Rectangle");
		int CircumfernceofRectangle=2*a*b;
		System.out.println("CircumfernceofRectangle="+CircumfernceofRectangle);
		System.out.println("Square");
		int square=a*a;
		System.out.println("Square="+square);
		System.out.println("C Square");
		int Csquare=4*a;
		System.out.println("C Square="+Csquare);
		System.out.println("Trianle");
		System.out.println("enter h value");
		int h=sc.nextInt();
		System.out.println("enter t value");
		double t=sc.nextDouble();
		double triangle=t*b*h;
		System.out.println("Trianle"+triangle);
		System.out.println("c Trianle");
		System.out.println("Enter c value");
		int c=sc.nextInt();
		int Ctriangle=a+b+c;
		System.out.println("c Trianle="+Ctriangle);
	}

}
