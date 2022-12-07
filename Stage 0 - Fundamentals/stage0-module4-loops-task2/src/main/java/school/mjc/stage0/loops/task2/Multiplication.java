package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            return;
        }
        int counter = 0;
        if (multiplyByAndToInclusive > 0) {
            while (counter <= multiplyByAndToInclusive) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        } else {
            while (counter >= multiplyByAndToInclusive) {
                System.out.println(counter * multiplyByAndToInclusive * -1);
                counter--;
            }
        }
    }
}
