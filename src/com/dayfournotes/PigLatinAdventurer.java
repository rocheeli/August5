package com.dayfournotes;


import java.util.Scanner;

public class PigLatinAdventurer {

	private static boolean pigLatin = true;
	
	public static void main(String[] args) {
		
	while (pigLatin == true) {
			
			Scanner word = new Scanner(System.in);
			Scanner number = new Scanner(System.in);
			System.out.println();
			System.out.println("\nThis is the pig latin translator");
			System.out.println("Enter the number of words in your sentence:");
			int numberOfWordsInSentence = number.nextInt();
			String[] wordsInSentence = new String [numberOfWordsInSentence];
			System.out.println("Input each word of your sentence, one at a time, and hit enter");
			System.out.println();
			
			for (int i = 0; i < wordsInSentence.length; i++) {
				System.out.println("Enter a word " + (i +1) + ":");
				wordsInSentence[i] = word.nextLine();
				wordsInSentence[i] = wordsInSentence[i].toLowerCase();
				
			}
			for (int i = 0; i < wordsInSentence.length; i++) {
				StringBuilder modifiedWordsInTheSentence = new StringBuilder(wordsInSentence[i]);
				char firstLetter = modifiedWordsInTheSentence.charAt(0);
				char secondLetter = modifiedWordsInTheSentence.charAt(1);
				if(isFirstLetterAVowel(firstLetter))
					{
					modifiedWordsInTheSentence.append("ay ");
					System.out.print(modifiedWordsInTheSentence);
					} 
				
				else if(firstTwoLettersAreConsonants(secondLetter))
				{
					
					modifiedWordsInTheSentence.append(firstLetter);
					modifiedWordsInTheSentence.append(secondLetter);
					modifiedWordsInTheSentence.deleteCharAt(0);
					modifiedWordsInTheSentence.deleteCharAt(0);
					modifiedWordsInTheSentence.append("ay ");
					
					System.out.print(modifiedWordsInTheSentence);
					
				}
				
				else
				{
					modifiedWordsInTheSentence.append(firstLetter);
					modifiedWordsInTheSentence.deleteCharAt(0);
					modifiedWordsInTheSentence.append("ay ");
					System.out.print(modifiedWordsInTheSentence);	
				
				}
				
				
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
		boolean firstTwoLettersAreConsonants = true;
		for (int i = 0; i < vowel.length; i++);
		{
			int i = 0;
			if(secondLetter == vowel[i])
			{
				firstTwoLettersAreConsonants = false;
			}
		}
		
		return firstTwoLettersAreConsonants;
	}
}
//started to get a little glitchy when i added the clusters
