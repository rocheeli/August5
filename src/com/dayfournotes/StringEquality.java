package com.dayfournotes;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		Scanner alien = new Scanner(System.in);
		
		for (int day = 0; day <= 8; day++) {
			switch (day) {
			case 1:
				happyDay(day);
				break;
			case 2:
				happyDay(day);
				break;

			default:
				thatsNotADay(day);
				break;
			}
		}
		System.out.println("How is your day?");
		System.out.println("you can choose 'great' or 'bad'");
		
		String theDayIs = alien.nextLine();
		
		switch (theDayIs.toLowerCase()) {
		case "great":
			System.out.println("Great to hear!");
			break;
		case "bad":
			System.out.println("Oh No");
			break;
		

		default:
			System.out.println("What?");
			break;
		}
	}

	private static void thatsNotADay(int day) {
			System.out.println("There are only 7 days in a week!!!");
	}

	private static void happyDay(int day)
	{
			System.out.println("Have a great day");		
	}

}
