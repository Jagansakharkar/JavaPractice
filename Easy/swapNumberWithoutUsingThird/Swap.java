
import java.util.Scanner;

class Swap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int n1 = scan.nextInt();
        System.out.print("Enter Second Number:");
        int n2 = scan.nextInt();

        System.out.println("Before Swap");
        System.out.println("First Number:" + n1);
        System.out.println("Second Number:" + n2);

        System.out.println("After Swap");
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("First number:" + n1);
        System.out.println("Second Number:" + n2);

    }
}
