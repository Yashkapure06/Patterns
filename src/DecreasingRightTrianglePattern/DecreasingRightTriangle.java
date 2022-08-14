package DecreasingRightTrianglePattern;

public class DecreasingRightTriangle {

	public static void main(String[] args) {

		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
