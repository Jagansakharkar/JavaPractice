
import java.util.Scanner;

class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Number:");
        int num = scan.nextInt();

// check the LST(least significant bit of number) by using &
// if 1 then odd
// else even
        if ((num & 1) == 1) {
            System.out.printf("The given number %d is Odd", num);
        } else {
            System.out.printf("The given number %d is Even", num);
        }
    }
}
