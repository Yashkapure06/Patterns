package ChristmasTreePattern;

public class ChristmasTree {
    public static void main(String[] args) {
        int height = 7;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" "); 
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); 
            }

            System.out.println(); 
        }

        
        for (int i = 1; i <= height / 2; i++) {
            for (int j = 1; j <= height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}