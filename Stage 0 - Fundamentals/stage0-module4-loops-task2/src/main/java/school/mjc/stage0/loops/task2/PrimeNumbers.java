package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 0;
        for (int i = 2; i <= printToInclusive; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
    }
    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
