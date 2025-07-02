package Module1Progroms;

public class NestedIf {

	public static void main(String[] args) 
	{
		char gender='f';
		char gender1='m';
		char gender2='c';
		if(gender=='f')
		{
			System.out.println("Free ticket in bus");
		
		 if(gender1=='m')
		{
			System.out.println("Buy the ticket");
			if(gender2=='c')
			{
				System.out.println("Buy the half ticket");
			}
			else
			{
				System.out.println("not ext");
			}
		}
		 else
		 {
			 System.out.println("not 2ext"); 
		 }
		}
		 
		else
		{
			System.out.println("nothing");
		}
		
	}

}
