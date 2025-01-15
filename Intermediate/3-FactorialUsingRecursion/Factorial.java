
import java.util.Scanner;

class Factorial {

    public static int calculateFactorial(int n) {
        if (n <= 1) {  // Handle 0 and 1 explicitly
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {  // Ensure Scanner resource is closed
            System.out.print("Enter a positive integer: ");
            int n = scan.nextInt();

            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                System.out.println("Factorial of " + n + " is: " + calculateFactorial(n));
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
    }
}
