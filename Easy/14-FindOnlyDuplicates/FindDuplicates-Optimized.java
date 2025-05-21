
import java.util.HashSet;

class FindDuplicates {

    public int findDuplicates(int arr[]) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                return arr[i];
            }
            seen.add(arr[i]);
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
