//	Take 1D array as user input and sort the elements using Insertion sort algorithm
//	Example :
//	Input : 12, 11, 13, 5, 6
//	Output : 5, 6, 11, 12, 13 

//ask for number of input
//inserting elements of array (Of number of inputs)
//sorting array using insrtion sort

import java.util.Scanner;

public class InsertionsortOFInt {

	static Scanner sc = new Scanner(System.in);

	public static int[] arrayInsertion(int[] intArray, int n) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Enter element: " + (i + 1));
			intArray[i] = sc.nextInt();
		}
		return intArray;
	}

	public static int[] sortinArray(int[] intArray) {
		int n = intArray.length;
		for (int i = 1; i < n; ++i) {
			int key = intArray[i];
			System.out.println(key);
			int j = i - 1;

			while (j >= 0 && intArray[j] > key) {
				intArray[j + 1] = intArray[j];
				j = j - 1;
			}
			intArray[j + 1] = key;
		}
		return intArray;
	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter number of elements");

		int numberOfElements = sc.nextInt();
		int intArray[] = new int[numberOfElements];

		int[] array = arrayInsertion(intArray, numberOfElements);
		int[] sortedArray = sortinArray(array);
		displayArray(sortedArray);
	}
}
