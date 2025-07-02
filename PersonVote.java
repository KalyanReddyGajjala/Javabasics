package Assignments;

public class PersonVote {

	public static void main(String[] args)
	{
	 String Male="He";
	 String Female="She";
	 int age=18;
			 if(age>=18)
			 {
				 if(Male=="He" || Female=="She")
				 {
					 System.out.println("Person is eligible for Vote ");
				 }
				 else
				 {
					 System.out.println("Person is not eligible for Vote");
				 }
			 }
			 else
			 {
				 System.out.println("Get Age Greater then 18 to Vote");
			 }
		

	}

}
