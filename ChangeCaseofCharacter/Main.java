
import java.util.Scanner;

class ChangeCaseofCharactor {

    String str;
    int[] index;
    char[] charr;

    public ChangeCaseofCharactor(String str) {
        this.str = str;
        this.index = new int[str.length()]; // Initialize the index array
        this.charr = new char[str.length()];
    }

    public void getAscii() {
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            index[i] = ch; // Store ASCII value in index array
        }
    }

    public void changeCase() {
        for (int i = 0; i < index.length; i++) {
            if (index[i] >= 97 && index[i] <= 122) { // lowercase to uppercase
                charr[i] = (char) (index[i] - 32);
            } else if (index[i] >= 65 && index[i] <= 90) { // uppercase to lowercase
                charr[i] = (char) (index[i] + 32);
            } else {
                charr[i] = (char) index[i]; // if it's not an alphabetic character
            }
        }
    }

    void display() {
        System.out.println("After Change case:");
        for (int i = 0; i < charr.length; i++) {
            System.out.print(charr[i]);
        }
        System.out.println();
    }
}

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scan.nextLine(); // Use nextLine() to read the entire line

        ChangeCaseofCharactor c = new ChangeCaseofCharactor(str);
        c.getAscii(); // Call getAscii method to populate the index array
        c.changeCase(); // Call changeCase method to change the case of characters
        c.display(); // Display the characters after changing their case
    }
}
