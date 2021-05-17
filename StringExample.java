import java.util.Scanner;

//	Write a Program to print first non-repeated character from the string using array.
//	Example : 
//	Input: Cricket
//	Output: r
//--------------------------------------------------------------------------------------
//pseudo code
//-------------------------------------------------------------------------------------
//ask for string
//travers trough thw string/
//take first character
//check with others
//if yes->increment to next char
//if no->print ch

public class StringExample {
	private static char checkCharacterMaching(String input) {
		char character = 0;
		for (int i = 0; i < input.length(); i++) {
			character = input.charAt(i);
			for (int j = 0; j < input.length(); j++) {
				int compare = Character.compare(character, input.charAt(j));
				if (compare == 0) {
					continue;
				}
				break;
			}
		}
		return character;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String input = sc.nextLine();
		char character = checkCharacterMaching(input);
		System.out.println(character);
	}
}
