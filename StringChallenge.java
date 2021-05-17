import java.util.Scanner;

//	Example1 :
//
//	Write a program to take a sentence as an input and swap 1st word and last word and reverse the characters of these words.
//	Traverse remaining words and change the vowels to next character and change its case.
//	Note: Splitting of words should be based on unser input(special characters).
//
//
//
//	input
//	welcome_to_java_programming
//	Split char: _
//
//	After Splitting:
//	welcome
//	to
//	java
//	programming
//
//	output
//	gnimmargorp tP jBvB emoclew

//Ask input from user
//splitt with _ or space or , 
//store in the string array
//using string array
//1. reversining thet first word and last word
//2. changing character to next character & changing Case of the character
//3. swaping the first word with last word
//displaying Strings

public class StringChallenge {

	static String[] words;
	static int length = 0;

	// --------------------------------------------------------------------------------
	// Reversing and CaseChangeing method
	// --------------------------------------------------------------------------------
	public static String[] reveringCharacter(String[] words) {
		int num = length;
		String reversedWord = "";
		String changedWord = "";
		for (int j = 0; j < length; j++) {
			String word = words[j];

			// checking for first word and last word
			if (j == 0 || j == num - 1) {
				reversedWord = "";
				for (int k = word.length() - 1; k >= 0; k--) {
					reversedWord += word.charAt(k);
				}
				words[j] = reversedWord;
			} else {

				for (int k = 0; k < word.length(); k++) {
					char character = word.charAt(k);

					// checking for vowels and changeing character and case of the character
					if (character == 'a' || character == 'e' || character == 'i' || character == 'o'
							|| character == 'u') {
						character = (char) (character + 1);
						character = (char) (character - 32);
						changedWord += character;
					} else if (character == 'A' || character == 'E' || character == 'I' || character == 'O'
							|| character == 'U') {
						character = (char) (character + 1);
						character = (char) (character + 32);
						changedWord += character;
					} else {
						changedWord += character;
					}

				}
				words[j] = changedWord;
				changedWord = "";

			}
		}
		return words;
	}

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
	// Display method
	// --------------------------------------------------------------------------------
	public static void displayArray(String[] array) {
		for (int i = 0; i < length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}
	//--------------------------------------------------------------------------------
		// Counting words method
	//--------------------------------------------------------------------------------
	private static int countNumberOfWords(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); ++i) {
			if (input.charAt(i) == ' ' || input.charAt(i) == '_' || input.charAt(i) == ',') {
				count++;
			}
		}

		return count;

	}
//--------------------------------------------------------------------------------
	// Main method
//--------------------------------------------------------------------------------

	public static void main(String[] args) {
		System.out.println("Enter input string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int numberOfWords = countNumberOfWords(input);
		words = new String[numberOfWords + 1];

		String[] splitedArray = split(input);
		String[] reversedArray = reveringCharacter(splitedArray);
		String[] swapedArray = swapingWords(reversedArray);

		displayArray(swapedArray);

	}
}
