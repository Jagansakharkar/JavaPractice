
import java.util.Scanner;

class SortAndRemove {

    int[] arr;

    public SortAndRemove(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int searchElement(int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public int[] deleteElement(int index) {
        if (index >= 0 && index < arr.length) {
            System.err.println("Element Deleted: " + arr[index]);
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[j++] = arr[i];
                }
            }
            return newArr;
        } else {
            System.out.println("Element not found in the array.");
            return arr;
        }
    }
}

class RemoveElement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Elements into the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Entered Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Object of Class
        SortAndRemove s = new SortAndRemove(arr);
        // Sort Array
        s.sort();
        // Array After Sorting
        System.out.println("Array After Sorting:");
        s.display();

        // find element index
        System.out.println("Enter the element you want to delete:");
        int target = scan.nextInt();
        int index = s.searchElement(target);

        // delete
        int[] newArr = s.deleteElement(index);
        // display after deleting
        SortAndRemove newS = new SortAndRemove(newArr);
        newS.display();
    }
}
