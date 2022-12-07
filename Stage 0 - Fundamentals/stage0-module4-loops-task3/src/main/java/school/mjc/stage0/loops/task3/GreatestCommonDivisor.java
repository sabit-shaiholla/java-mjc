package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        // Ensure that first is the smaller number
        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }

        // Calculate the GCD using the Euclidean algorithm
        while (first != 0) {
            int temp = second % first;
            second = first;
            first = temp;
        }
        System.out.println(second);
    }
}
