
import java.util.Scanner;

class ArmstrongNumber {

    public static boolean isArmstrong(int num) {
        int t = num;
        int sum = 0;

        // Checks for number smaller than 1
        if (num < 1) {
            return false;
        }

        // for numbers greater than 1
        while (num > 0) {
            int d = num % 10;
            sum += d * d * d;
            num = num / 10;
        }

        // check sum is equal to the actual number
        if (t == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Number:");
        int num = scan.nextInt();

        if (isArmstrong(num)) {
            System.out.printf("The number %d is Armstrong", num);
        } else {
            System.out.printf("The number %d is not Armstrong", num);
        }
    }
}
