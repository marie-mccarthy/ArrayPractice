import java.util.Scanner;

public class ArrayPractice1
	{
	static int counter = 0;
		public static void main(String[] args)
		{
			exercise1();		
	//		exercise2();
		}
	public static int exercise1()
	{
		System.out.println("How many favorite sweets do you have?");
		Scanner userInput2= new Scanner(System.in);
		int number = userInput2.nextInt();	
		
		String[] sweetsList = new String[number];		
			System.out.println("enter a sweet please:");
			Scanner userInput= new Scanner(System.in);
			String sweetName = userInput.nextLine();
			sweetsList[number]= sweetName;
			System.out.println(sweetName);
		
		for(String sweetName1:sweetsList)
			{
				sweetsList[number]= sweetName;
				System.out.println(sweetsList);
			}
		return number;
	}	
	//public static int exercise2()
	{
		System.out.println("Please input 8 numbers");
		int[] myArray = new int[8];
	
		for(int[] myArray)
		{
			System.out.println("enter a number:");
			Scanner userInput= new Scanner(System.in);
			int numbers2 = userInput.nextInt();
			myArray[8]=numbers2;
		}

	{
	}
	}
	}

