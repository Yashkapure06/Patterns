package DiamondPattern;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		for (i = 1; i <= 5; i++) { // For rows
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = 4; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
