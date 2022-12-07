package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        // Check if the input is valid
        if (lastFibonacci < 1) {
            System.out.println("Invalid input");
            return;
        }

        // Initialize the first two numbers in the series
        int first = 0;
        int second = 1;
        System.out.println(first);
        if (lastFibonacci > 1) {
            System.out.println(second);
        }

        // Calculate and print the remaining terms
        for (int i = 2; i < lastFibonacci; i++) {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}
