
/*
 * 
 * 
 * 
		Write a program to read sentence with two words as an user input and swap 
		
		both the words ignoring the letters which are common in both the words.  
		Return an error message if sentence contains more than 2 words
		Example:
		Input:  “Hello World”
		Output: Wrd He
 * */

import java.util.Scanner;

public class CodingChallenge {

	static String[] words;
	static int length = 0;

	// --------------------------------------------------------------------------------
	// Splitting method
	// --------------------------------------------------------------------------------
	private static String[] split(String input) {

		String word = "";
		input = input + " ";
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == ' ' || input.charAt(i) == '_' || input.charAt(i) == ',') {
				words[length] = word;
				length++;
				word = "";
			} else {
				word = word + input.charAt(i);
			}

		}
		return words;

	}

	// --------------------------------------------------------------------------------
	// Ignoring duplicate charecters method
	// --------------------------------------------------------------------------------
	public static String ignoring(String input) {
		char character;
		String ign = "";

		for (int i = 0; i < input.length(); i++) {
			int counter = 0;
			character = input.charAt(i);
			if (character == ' ') {
				ign += ' ';
			}
			for (int j = 0; j < input.length(); j++) {
				if (character == input.charAt(j)) {
					counter++;
				}
			}
			if (counter == 1) {
				ign += character;
			}
		}
		return ign;

	}

	// --------------------------------------------------------------------------------
	// Swaping method
	// --------------------------------------------------------------------------------
	public static String[] swapingWords(String[] reversedArray) {
		String swap = "";
		int num = length, firstWord = 0, lastWord = 0;
		for (int i = 0; i < reversedArray.length; i++) {
			if (i == 0) {
				firstWord = i;
			}
			if (i == num - 1) {
				lastWord = i;
			}
			swap = reversedArray[firstWord];
			reversedArray[firstWord] = reversedArray[lastWord];
			reversedArray[lastWord] = swap;

		}
		return reversedArray;

	}

	// --------------------------------------------------------------------------------
	// Counting number of words method
	// --------------------------------------------------------------------------------
	private static int countNumberOfWords(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); ++i) {
			if (input.charAt(i) == ' ' || input.charAt(i) == '_' || input.charAt(i) == ',') {
				count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {
		System.out.println("Enter Sentence");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String output = ignoring(input);

		int count = countNumberOfWords(output);
		if (count > 2) {
			System.out.println("Words are exceeding range");
		}
		words = new String[count + 1];

		String[] splitedArray = split(output);
		String[] swapedArray = swapingWords(splitedArray);

		for (int i = 0; i < swapedArray.length; i++) {
			System.out.print(swapedArray[i] + " ");
		}
	}
}
