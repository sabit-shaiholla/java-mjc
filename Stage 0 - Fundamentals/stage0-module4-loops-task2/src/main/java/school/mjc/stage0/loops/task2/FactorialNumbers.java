package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive <= 0) {
            System.out.println(1);
            return;
        }
        int counter = 1;
        int factorial = 1;
        while (counter <= printToInclusive) {
            System.out.println(factorial);
            factorial *= counter;
            counter++;
        }
        System.out.println(factorial);
    }
}
