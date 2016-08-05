package com.dayfournotes;

import java.util.Scanner;

public class PigLatinLegendary {

	private static boolean pigLatin = true;
	
	public static void main(String[] args) {
		
		
while (pigLatin == true) {
			
			Scanner word = new Scanner(System.in);
			System.out.println();
			System.out.println("\nThis is the pig latin translator");
			System.out.println("Enter the sentence you wish to translate:");
			String userSentence = word.nextLine();
			String[] wholeSentence = userSentence.split("\\s");
			System.out.println();
			
				
			for (int i = 0; i < wholeSentence.length; i++) {
				StringBuilder modifiedWordsInTheSentence = new StringBuilder(wholeSentence[i]);
				char firstLetter = modifiedWordsInTheSentence.charAt(0);
				
				if(isFirstLetterAVowel(firstLetter))
					{
					modifiedWordsInTheSentence.append("ay ");
					System.out.print(modifiedWordsInTheSentence);
				} 
				else
				{
					modifiedWordsInTheSentence.append(firstLetter + "ay ");
					modifiedWordsInTheSentence.deleteCharAt(0);
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


	}

//didn't include clusters in this one because it was screwing up my other class
