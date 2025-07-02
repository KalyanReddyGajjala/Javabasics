package Module1Progroms;

import java.util.ArrayList;

public class ArrayListPrograms
{
	public static void main(String ar[])
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(22);
		a1.add(23);
		a1.add(24);
		a1.add(25);
		System.out.println(a1);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(78);
		a2.add(79);
		a2.add(80);
		a2.add(81);
		System.out.println(a2);
		a2.addAll(a1);
		System.out.println(a2);
		a2.add(0, 99);
		System.out.println(a2);
		a2.addAll(0, a1);
		System.out.println(a2);
		//a2.remove(0);
		System.out.println(a2);
		boolean b=a2.contains(a1);
		System.out.println(b);
		boolean b1=a2.containsAll(a1);
		System.out.println(b1);
		boolean b2=a2.isEmpty();
		System.out.println(b2);
		a2.removeAll(a2);
		boolean b3=a2.isEmpty();
		System.out.println(a2);
		System.out.println(b3);
		
	}

}
