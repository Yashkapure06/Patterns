package RightTrianglePatterns;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i for rows and j for columns
		// row denotes the number of rows you want to print
		int i, j, row = 6;
		// outer for loop -> for rows
		for (i = 0; i < row; i++) {
			// inner for loop -> for columns
			for (j = 0; j <= i; j++) {
				// print stars
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
