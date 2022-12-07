package lang.print.gaps.task5;

import java.text.MessageFormat;

public class ThreeStuckVars {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println(MessageFormat.format("{0}{1}{2}",first,second,third));
    }
}
