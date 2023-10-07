package ChristmasTreePattern;

public class ChristmasTree {
    public static void main(String[] args) {
        int height = 7; // Adjust the height of the banana pattern as needed

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" "); // Print spaces for the left side of the banana
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // Print asterisks for the curved part of the banana
            }

            System.out.println(); // Move to the next line
        }

        // Print the stem of the banana
        for (int i = 1; i <= height / 2; i++) {
            for (int j = 1; j <= height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}