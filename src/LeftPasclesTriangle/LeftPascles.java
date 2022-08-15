package LeftPasclesTriangle;

public class LeftPascles {

	public static void main(String[] args) {
		int i, j, k;
		// TODO Auto-generated method stub
		for (i = 1; i <= 5; i++) {

			for (j = i; j < 5; j++) {
				System.out.print(" ");//For Spaces from left
			}
			for (k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 5; i >= 1; i--) {
			for (j = i; j <= 5; j++) {
				System.out.print(" ");//For Spaces from lefts
			}
			for (k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
