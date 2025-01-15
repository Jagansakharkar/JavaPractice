
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any String:");
        String str = scan.next();

        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'a':
                    ch[i] = (char) (ch[i] - 32);
                    break;
                case 'e':
                    ch[i] = (char) (ch[i] - 32);
                    break;
                case 'i':
                    ch[i] = (char) (ch[i] - 32);
                    break;
                case 'o':
                    ch[i] = (char) (ch[i] - 32);
                    break;
                case 'u':
                    ch[i] = (char) (ch[i] - 32);
                    break;

            }

        }
        String newStr = new String(ch);
        System.out.println("Before Changing Case:" + str);
        System.err.println("After Changing Case:" + newStr);

    }
}
