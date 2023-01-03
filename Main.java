public class Main
{
	public static void main(String[] args)
	{
		Quiz quiz1,quiz2; //create object quiz

		quiz1 = new Quiz(18, 20,191021);
		quiz2= new Quiz(15, 20,191022); 
		System.out.println(quiz1.calculategrade()+"% is the grade of the student "+quiz1.getID());
		
		System.out.println(quiz2.calculategrade()+"% is the grade of the student "+quiz2.getID()); 
	}
}
