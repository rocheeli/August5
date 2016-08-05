package com.dayfournotes;

import java.util.Scanner;

public class PigLatinExplorer {
	
	private static boolean pigLatin = true;
	
public static void main(String[] args) {
	
	while (pigLatin == true) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to translate into Pig Latin:");
		String userInput = sc.nextLine();
		userInput = userInput.toLowerCase();
		StringBuilder modUserInput = new StringBuilder(userInput);
		char firstLetter = modUserInput.charAt(0);
		char secondLetter = modUserInput.charAt(1);
		
		if (isFirstLetterAVowel(firstLetter))
		{
			modUserInput.append("ay");
			System.out.println(modUserInput);
		} 
		else if(firstTwoLettersAreConsonants(secondLetter))
		{
			
			modUserInput.append(firstLetter);
			modUserInput.append(secondLetter);
			modUserInput.deleteCharAt(0);
			modUserInput.deleteCharAt(0);
			modUserInput.append("ay");
			
			System.out.println(modUserInput);
			System.out.println();
			
		}
		else
		{
			modUserInput.append(firstLetter + "ay");
			modUserInput.deleteCharAt(0);

			System.out.println(modUserInput);
			System.out.println();
		} 
	}

	
}
public static boolean isFirstLetterAVowel(char firstLetter)
{
	char[] vowel = {'a', 'e', 'i', 'o', 'u'};
	boolean isThisAVowel = false;
	for (int i = 0; i < vowel.length; i++);
	{
		int i = 0;
		if(firstLetter == vowel[i])
		{
			isThisAVowel = true;
		}
	}
	
	return isThisAVowel;
}
public static boolean firstTwoLettersAreConsonants(char secondLetter)
{
	char[] vowel = {'a', 'e', 'i', 'o', 'u'};
	boolean firstTwoLettersAreConsonants = false;
	for (int i = 0; i < vowel.length; i++);
	{
		int i = 0;
		if(secondLetter != vowel[i])
		{
			firstTwoLettersAreConsonants = true;
		}
	}
	
	return firstTwoLettersAreConsonants;
}
}
