
import java.util.Scanner;

class OccurrenceOfDigits {

    public static int cubeOfNum(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int n = scan.nextInt();

        System.out.print("Target Number: ");
        int target = scan.nextInt();

        int count = 0;
        int cube = cubeOfNum(n);

        while (cube > 0) {
            int digit = cube % 10;
            if (digit == target) {
                count++;
            }
            cube = cube / 10; // Reduce the cube value
        }

        System.out.println("Number " + target + " occurs " + count + " times in cube of " + n);
        scan.close();
    }
}
