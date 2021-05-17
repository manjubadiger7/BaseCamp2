
public class soretedTwoD {
	public static void main(String[] args) {
		int[][] array = { {1, 4, 7}, {2, 5, 8}, {3, 6, 9} };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				 System.out.print(array[j][i]);
			}
			System.out.println();
			
		}
	}
}
