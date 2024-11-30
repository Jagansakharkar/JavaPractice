
import java.util.Scanner;

class SumOfDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Number:");
        int n = scan.nextInt();

        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
        System.out.print("Sum of digits:" + sum);
    }
}
