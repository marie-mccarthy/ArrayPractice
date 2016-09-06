import java.util.Scanner;

public class ArrayPractice1
	{
		public static void main(String[] args)
		{
			exercise1();			
		}
	public static int exercise1()
	{
		System.out.println("How many favorite sweets do you have");
		Scanner userInput2= new Scanner(System.in);
		int number = userInput2.nextInt();	
			
		System.out.println("What are they");
		Scanner userInput= new Scanner(System.in);
		String sweetName = userInput.nextLine();
		
		String[] sweetsList = new String[number];
		sweetsList[number] = sweetName;
			
		System.out.println(sweetsList);
		return number;
	}
		
}
