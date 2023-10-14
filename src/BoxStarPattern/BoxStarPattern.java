package BoxStarPattern;

public class BoxStarPattern {
  public static void main(String[] args) {
		int i, j;

		for (i = 0; i <= 5; i++) {
			for (j = 0; j <= 5; j++) {
        if (i == 0 || i == 5) {
				  System.out.print("* ");
        } else {
          if (j == 0 || j == 5) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        }
			}
			System.out.println();
		}

	}
}
