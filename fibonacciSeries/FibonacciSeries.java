
class FibonacciSeries {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int t = 19;
        int c;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i < t; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
