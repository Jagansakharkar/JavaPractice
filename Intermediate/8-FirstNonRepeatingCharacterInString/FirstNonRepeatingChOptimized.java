
import java.util.LinkedHashMap;

class FirstNonRepeatingChOptimized {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        String str = "this is it";
        LinkedHashMap<Character, Integer> freqmap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            freqmap.put(ch, freqmap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : freqmap.keySet()) {
            if (freqmap.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }
    }
}
