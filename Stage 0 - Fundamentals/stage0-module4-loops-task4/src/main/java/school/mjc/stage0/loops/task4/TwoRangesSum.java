package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        // Check if numberToSkip is greater than lastInRow
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }

        // Check if lastInRow is negative
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }

        // Calculate the sum of the two ranges
        int skippedSum = 0;
        int countedSum = 0;
        for (int i = 1; i <= lastInRow; i++) {
            if (i <= numberToSkip) {
                skippedSum += i;
            } else {
                countedSum += i;
            }
        }


        // Print the sums
        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + countedSum);
    }
}
