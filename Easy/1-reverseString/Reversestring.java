
import java.util.Scanner;

public class Reversestring {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str = scan.next();
        String reversedStr = reverse(str);
        System.out.println("Reversed string: " + reversedStr);
    }

    static String reverse(String str) {
        char[] ar = str.toCharArray();
        for (int i = 0, j = ar.length - 1; i < j; i++, j--) {
            char temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
        return new String(ar);
    }
}
