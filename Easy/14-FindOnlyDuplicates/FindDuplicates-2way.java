
import java.util.Arrays;

class FindDuplicates {

    public int findDuplicates(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5};
        FindDuplicates f = new FindDuplicates();

        int result = f.findDuplicates(arr);
        if (result != -1) {
            System.out.println("Duplicate element is: " + result);
        } else {
            System.out.println("Not found any duplicates");
        }

    }
}
