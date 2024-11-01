package HeartPattern;

public class HeartPattern {
    public static void main(String[] args) {
        int size = 5;

        // Top part of the heart
        for (int i = size / 2; i <= size; i += 2) {
            // Print spaces before the first half of the heart
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }
            // Print the first half of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces between the two halves of the heart
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print the second half of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom part of the heart
        for (int i = size; i >= 1; i-=2) {
            // Print spaces before each row
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            // Print the bottom part of the heart
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
