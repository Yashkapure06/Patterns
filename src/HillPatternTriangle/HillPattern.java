package HillPatternTriangle;

public class HillPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row = 6;

		System.out.println();
		for (i = 0; i < row; i++) {

			for (j = 2 * (row - i); j >= 0; j--) {

				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			for (j = 6; j <= i + row; j++) {
				System.out.print(" *");
			}


			// throws the cursor in a new line after printing each line
			System.out.println();
		}
	}

}
