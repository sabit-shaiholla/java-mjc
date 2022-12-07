package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String numberString = Integer.toString(number);
        StringBuilder reversed = new StringBuilder();

        for (int i = numberString.length() - 1; i >= 0; i--) {
            reversed.append(numberString.charAt(i));
        }

        System.out.println(reversed.toString());
    }
}
