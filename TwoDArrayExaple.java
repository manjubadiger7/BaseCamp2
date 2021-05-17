import java.util.Scanner;

public class TwoDArrayExaple {
	static Scanner sc = new Scanner(System.in);
	static int[][] TwoDArray;
	static int[][] transposeArray;

	private static int[][] insertArray(int numberofRowsAndColumns) {
		TwoDArray = new int[numberofRowsAndColumns][numberofRowsAndColumns];
		for (int i = 0; i < TwoDArray.length; i++) {
			for (int j = 0; j < TwoDArray.length; j++) {
				System.out.println("Enter element of: " + i + " and " + j);
				TwoDArray[i][j] = sc.nextInt();

			}
		}
		return TwoDArray;

	}

	public static int[][] transposeMatrix(int[][] array) {
		transposeArray = new int[array.length][array.length];
		for (int i = 0; i < array.length; i++) {

			int[] sorting = new int[array.length];

			for (int j = 0; j < array.length; j++) {
				sorting[j] = array[j][i];
			}
			sorting = bubbleSort(sorting);

			for (int j = 0; j < sorting.length; j++) {
				transposeArray[j][i] = sorting[j];
			}
		}
		return transposeArray;

	}

	public static void display(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[] bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println("Enter number of elements for n*n matrices");

		int numberofRowsAndColumns = sc.nextInt();

		int[][] TwoDArray = insertArray(numberofRowsAndColumns);
		System.out.println("Before sorting");
		display(TwoDArray);
		System.out.println("After sorting");
		transposeMatrix(TwoDArray);
		display(transposeArray);

	}
}
