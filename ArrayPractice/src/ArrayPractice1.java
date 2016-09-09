import java.util.Scanner;

public class ArrayPractice1
	{
	static int counter = 0;
		public static void main(String[] args)
		{
		//	exercise1();		
			exercise2();
		}
	public static int exercise1()
	{
		System.out.println("How many favorite sweets do you have?");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int a = -1;
		System.out.println("What are they?");
		for(int i=0; i<number; i++)
		{
			Scanner userInput= new Scanner(System.in);
			String sweetName = userInput.nextLine();	
			a++;
			String [] sweets = new String [number];
			sweets [a] =sweetName;
			
			if((a+1)==number)
			{
				System.out.println(sweetName);
			}
		}
		return number;
	}	
	public static int exercise2()
	{
		System.out.println("Please input 8 numbers.");
		int a = -1;
		System.out.println("What are they?");
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0; i<8; i++)
		{
			Scanner userInput= new Scanner(System.in);
			int number = userInput.nextInt();	
			a++;
			int [] myArray = new int [8];
			myArray [a] =number;
			
			if(myArray[a]%2==1)
			{
				System.out.println("odd");
				int oddSum = sum1+a;
				System.out.println("Odd sum = "+oddSum+".");
			}
			else 
			{
				System.out.println("even");
				int evenSum = sum2 +a;
				System.out.println("Even sum = "+evenSum+".");
			}
			
		}
		return a;
	}
	}
	

