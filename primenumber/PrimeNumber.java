
import java.util.Scanner;

class PrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = scan.nextInt();

        int flag = 0;
        if (n < 2) {
            flag = 0;
        } else {

            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.println("Not Prime Number");
        } else {
            System.out.println("Prime Number");
        }

    }
}
