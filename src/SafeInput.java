import java.util.Scanner;

public class SafeInput {
    /**
     * Get an integer from the user.
     *
     * @param pipe    a Scanner opened to read from System.in
     * @param prompt  prompt for the user
     * @return an integer input from the user
     */
    public static int getInt(Scanner pipe, String prompt) {
        int userInput = 0;
        boolean isValidInput = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                userInput = pipe.nextInt();
                isValidInput = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // Read and discard the invalid input
            }
        } while (!isValidInput);

        // Clear the buffer
        pipe.nextLine();

        return userInput;
    }

    /**
     * Get a double value from the user.
     *
     * @param pipe    a Scanner opened to read from System.in
     * @param prompt  prompt for the user
     * @return a double value input from the user
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double userInput = 0;
        boolean isValidInput = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                userInput = pipe.nextDouble();
                isValidInput = true;
            } else {
                System.out.println("Invalid input. Please enter a double value.");
                pipe.next(); // Read and discard the invalid input
            }
        } while (!isValidInput);

        // Clear the buffer
        pipe.nextLine();

        return userInput;
    }
}
