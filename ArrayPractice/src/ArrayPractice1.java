import java.util.Scanner;

public class ArrayPractice1
	{
	static int counter = 0;
		public static void main(String[] args)
		{
			exercise1();		
			exercise2();
		}
	public static int exercise1()
	{
		Scanner userInput2= new Scanner(System.in);
		int number = userInput2.nextInt();	
		
		String[] sweetsList = new String[number];
		
		
		for(String sweets:sweetsList)
		{
			System.out.println("enter a sweet please:");
			Scanner userInput= new Scanner(System.in);
			String sweetName = userInput.nextLine();
			System.out.println(sweetName);
		}
		for(String sweets:sweetsList)
		{
		//	System.out.println(sweetName);
		}
	return number;
	}
	public static int exercise2()
	{
		System.out.println("Please input 8 numbers");
		int[] myArray = new int[8];
	
		for(int numbers:myArray)
		{
			System.out.println("enter a number:");
			Scanner userInput= new Scanner(System.in);
			int numbers = userInput.nextInt();
			myArray[8]=numbers;
		}

	{
	}
	}
	}

