
import java.util.Scanner;

class SumOfDigits {

    public static int sumDig(int n) {
        // base condition 
        if (n == 0) {
            return 0;
        }
        // getting each digits
        int d = n % 10;
        return d + sumDig(n / 10);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = scan.nextInt();
        System.out.print("Sum of digits of number " + n + " is " + sumDig(n));
    }
}
