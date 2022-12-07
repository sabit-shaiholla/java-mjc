package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        boolean firstIsGreater = first > second;
        int greatest = firstIsGreater ? first : second;
        System.out.println(greatest);
    }
}
