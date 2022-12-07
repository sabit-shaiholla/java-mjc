package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int number = 9;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum += number;
            number = number * 10 + 9;
        }
        System.out.println(sum);
    }
}
