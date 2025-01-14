
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any String:");
        String str = scan.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // character is digit or not
            if (Character.isDigit(ch)) {
                // get numeric value of number character
                int num = Character.getNumericValue(ch);
                // check even
                if (num % 2 == 0) {
                    sum += num;
                }
            }
        }
        System.out.println("Sum of Even digits in string :" + sum);
    }

}
