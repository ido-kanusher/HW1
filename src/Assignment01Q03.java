public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        long beforePrev = 1;
        long prev = 0;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            long fib = beforePrev + prev;
            System.out.print(fib);
            if (i < x - 1) {
                System.out.print(" "); // Make sure we don't print a trailing space
            }

            beforePrev = prev;
            prev = fib;

            if (fib % 2 != 0)
                numOdd++;
        }
        System.out.println();

        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
