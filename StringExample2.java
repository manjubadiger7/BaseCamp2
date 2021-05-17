
//	Write a program to group all lower case letters at end of each word 
//	Example : 
//	Input: Mindtree WebTech
//	Output: Mindtree WTebech
//--------------------------------------------------------------------------

import java.util.Scanner;

public class StringExample2 {

	static String[] words;

	static void sort() {
		String word = "WebTech";
		String sortedWord = "";
		int n = word.length();

		char character = 0;
		for (int i = 1; i < n; ++i) {
			char key = word.charAt(i);
			int j = i - 1;

			while (j >= 0 && (word.charAt(j) > 'a' && word.charAt(j) < 'z')) {
				character = word.charAt(j + 1);
				character = word.charAt(j);
				j = j - 1;
				sortedWord += character;
			}
			character = word.charAt(j + 1);
			character = key;

		}
		System.out.println(sortedWord);
	}

//	private static void displayArray(String output) {
//		for (int i = 0; i < words.length; i++) {
//			System.out.println(words[i]);
//		}
//
//	}

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
		sort();
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int numberOfWords = countNumberOfWords(input);
		words = new String[numberOfWords + 1];
		// String output =

//		for (int i = 0; i < words.length; i++) {
//			
//			words[i] = output;
//		}
		// displayArray(output);

	}
}
