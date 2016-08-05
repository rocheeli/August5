package com.dayfournotes;

public class Scratch {

	public static void main(String[] args) 
	{
		
		for (int i = 1; i <= 110; i++)
		{
			
			if (divisableByAllThree(i))
			{
				System.out.println("FizzBuzzBang");
			}
			else if (divisableByThreeAndFive(i))
			{
				System.out.println("FizzBuzz");
			}
			else if(divisableByThreeAndSeven(i))
			{
				System.out.println("FizzBang");
			}
			else if(divisableByFiveAndSeven(i))
			{
				System.out.println("BuzzBang");
			}
			else if(divisableByThree(i))
			{
				System.out.println("Fizz");
			}
			else if(divisableByFive(i))
			{
				System.out.println("Buzz");
			}
			else if(divisableBySeven(i))
			{
				System.out.println("Bang");
			}
			else 
			{
				System.out.println(i);
			}
			
		}
		
	}
		public static boolean divisableByAllThree(int fromTheForLoop)
		
		{	
			boolean howsThisMethod = false;
			if(((fromTheForLoop % 3) ==0) && ((fromTheForLoop % 5) ==0) && ((fromTheForLoop % 7) ==0))
			{	
				howsThisMethod = true;
			}
			
			return howsThisMethod;
		}
		
		public static boolean divisableByThreeAndFive(int fromTheForLoop)
		{
			boolean howsThisForThreeAndFive = false;
			if(((fromTheForLoop % 3) ==0) && ((fromTheForLoop % 5) ==0))
			{
				howsThisForThreeAndFive = true;
			}
			
			return howsThisForThreeAndFive;
		}
		public static boolean divisableByThreeAndSeven(int fromTheForLoop)
		{
			boolean howsThisForThreeAndSeven = false;
			if(((fromTheForLoop % 3) ==0) && ((fromTheForLoop % 7) ==0))
			{
				howsThisForThreeAndSeven = true;
			}
			
			return howsThisForThreeAndSeven;
		}
		public static boolean divisableByFiveAndSeven(int fromTheForLoop)
		{
			boolean howsThisForFiveAndSeven = false;
			if(((fromTheForLoop % 5) ==0) && ((fromTheForLoop % 7) ==0))
			{
				howsThisForFiveAndSeven = true;
			}
			
			return howsThisForFiveAndSeven;
		}

		public static boolean divisableByThree(int fromTheForLoop)
		{
			boolean howsThisForThree = false;
			if(((fromTheForLoop % 3) ==0))
			{
				howsThisForThree = true;
			}
			
			return howsThisForThree;
		}
		public static boolean divisableByFive(int fromTheForLoop)
		{
			boolean howsThisForFive = false;
			if(((fromTheForLoop % 5) ==0))
			{
				howsThisForFive = true;
			}
			
			return howsThisForFive;
		}
		public static boolean divisableBySeven(int fromTheForLoop)
		{
			boolean howsThisForSeven = false;
			if(((fromTheForLoop % 7) ==0))
			{
				howsThisForSeven = true;
			}
			
			return howsThisForSeven;
			
		}
		
	}


