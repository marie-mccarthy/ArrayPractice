import java.util.Scanner;

public class ArrayPractice1
	{
	static int counter = 0;
		public static void main(String[] args)
		{
			exercise1();		
			exercise2();
			exercise3();
			exercise4();
		}
	public static int exercise1()
	{
		System.out.println("How many favorite sweets do you have?");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int a = -1;
		System.out.println("What are they?");
		String [] sweets = new String [number];
		for(int i=0; i<number; i++)
		{
			Scanner userInput= new Scanner(System.in);
			String sweetName = userInput.nextLine();	
			a++;			
			sweets [a] =sweetName;
		}
		for(String s : sweets)
			{
			System.out.print( s+" " );
			}
		
		return number;
	}	
	public static int exercise2()
	{
		System.out.println(" ");
		int a = -1;
		System.out.println("Please input 8 numbers.");
		
		int sumOdd = 0;
		int sumEven = 0;
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
				sumOdd+=number;
				System.out.println("Odd sum = "+sumOdd+".");
			}
			else 
			{
				System.out.println("even");
				sumEven+=number;
				System.out.println("Even sum = "+sumEven+".");
			}
			
		}
		return a;
	}
	
	public static int exercise3()
	{
		int a = 0;
		int [] myArray = new int [5];
		 for(int i=4; i>=0; i--)
		 {
			 int number=(int)(Math.random()*80)+10;
			 myArray [i] =number;
		 }
		for(int n : myArray)
			{
			System.out.println(n);
			}
		return a;
	}
	public static int exercise4()
	{		
		int b = 0;
		System.out.println("Please input four numbers");
		//takes the numbers
		Scanner userInput= new Scanner(System.in);
		String number1 = userInput.nextLine();	
		
		String[] digits = new String[4];
		 for(int i=3; i>=0; i--)
		 {			
			digits [i] =(number1.substring(b,b+1));
			b++;
		 }
		for(String n : digits)
			{
			System.out.println(n);
			}
		return b;
	}
}
	

