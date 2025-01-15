
import java.util.Scanner;

class Conversion {

    public static String decimalToBinary(int decimal) {
        // if decimal number is 0
        if (decimal == 0) {
            return "0";
        }
        // otherwise
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any Decimal number:");
        int decimal = scan.nextInt();

        System.out.print("Decimal:" + decimal + "Binary:" + decimalToBinary(decimal));

    }
}
