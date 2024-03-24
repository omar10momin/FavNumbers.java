import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test getInt method
        int favoriteInt = SafeInput.getInt(scanner, "Enter your favorite integer");

        // Test getDouble method
        double favoriteDouble = SafeInput.getDouble(scanner, "Enter your favorite double");

        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);

        scanner.close();
    }
}
