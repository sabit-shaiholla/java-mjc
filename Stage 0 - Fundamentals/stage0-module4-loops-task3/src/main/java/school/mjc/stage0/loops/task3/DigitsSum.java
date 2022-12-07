package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if (t < 0) {
            t = -t;
        }
        String s = Integer.toString(t);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }
        System.out.println(sum);
    }
}
