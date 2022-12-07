package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        if (lastPrinted < 1) {
            return;
        }

        // Print all numbers from 1 up to lastPrinted, skipping each 3rd
        for (int i = 1; i <= lastPrinted; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}
