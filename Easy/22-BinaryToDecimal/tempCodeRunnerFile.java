
import java.util.Scanner;

class Conversion {

    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 0;
        while (binary > 0) {
            decimal = decimal + (binary % 10) * (int) Math.pow(2, power++);
            binary = binary / 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any binary number");
        int binary = scan.nextInt();
        System.out.println("Binary: " + binary + " Decimal: " + binaryToDecimal(binary));

    }
}
