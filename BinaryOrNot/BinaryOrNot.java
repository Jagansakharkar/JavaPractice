
import java.util.Scanner;

class BinaryOrNot {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();
        int flag = 0;
        while (n > 0) {
            int d = n % 10;
            if (d > 1) {
                flag = 1;
            }
            n = n / 10;
        }
        if (flag == 1) {
            System.out.print("Not Binary");
        } else {
            System.out.println("Binary");
        }
    }
}
