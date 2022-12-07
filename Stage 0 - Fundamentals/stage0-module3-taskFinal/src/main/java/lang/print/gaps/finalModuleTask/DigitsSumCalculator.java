package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        String numberString = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numberString.length(); i++){
            sum += Integer.parseInt(Character.toString(numberString.charAt(i)));
        }
        System.out.println(sum);
    }
}
