package Assignments;
//Assignment 36
class TypeCastingProgram
{
	public void test()
	{
		System.out.println("hello");
	
	}
}
class TypeCastingProgram1 extends TypeCastingProgram
{
	public void test1()
	{
		System.out.println("hi");
	}
}
public class GlassTypeCasting
{
	public static void main(String ar[])
	{
		TypeCastingProgram t1=new TypeCastingProgram1();
		t1.test();
		TypeCastingProgram1 t2=(TypeCastingProgram1)t1;
		t2.test1();
		t2.test();
	}

}
