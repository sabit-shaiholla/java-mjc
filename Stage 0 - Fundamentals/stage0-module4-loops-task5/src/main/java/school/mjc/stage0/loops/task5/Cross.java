package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength <= 0) {
            return;
        }
        int middle = (sideLength + 1) / 2;

        for (int i = 1; i <= sideLength; i++) {
            if (i == middle) {
                // print the middle line
                for (int j = 1; j <= sideLength; j++) {
                    System.out.print("8");
                }
                System.out.println();
            } else {
                // print the top and bottom lines
                System.out.println(" ".repeat(middle - 1) + "8" + " ".repeat(middle - 1));
            }
        }
    }
}
