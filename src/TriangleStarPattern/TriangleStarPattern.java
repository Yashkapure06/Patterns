package TriangleStarPattern;

public class TriangleStarPattern {

    public static void main(String[] args) {
        // Declare variables i, j, k, and set the number of rows to 9
        int i, j, k, rows = 9;

        // Loop through rows from 1 to 9
        for (i = 1; i <= rows; i++) {
            // Print spaces before the pattern to center it
            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Loop to print the pattern for the current row
            for (k = 1; k <= (2 * i - 1); k++) {
                // If it's the first character, last character, or the bottom row, print '*'
                if (k == 1 || i == rows || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    // Otherwise, print a space to create the hollow pattern
                    System.out.print(" ");
                }
            }

            // Move to the next line for the next row this will addd new line in the pattern
            System.out.println("");
        }

    }
}
