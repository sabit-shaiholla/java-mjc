package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height <= 0) {
            return;
        }

        int middle = height / 2 + 1;

        for (int i = 1; i <= height; i++) {
            if (i == middle) {
                // print the middle line
                for (int j = 1; j <= height; j++) {
                    System.out.print("8");
                }
                System.out.println();
            } else if (i < middle) {
                // print the top half of the hourglass
                int numSpaces = middle - i;
                for (int j = 1; j <= numSpaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= height - 2 * numSpaces; j++) {
                    System.out.print("8");
                }
                System.out.println();
            } else {
                // print the bottom half of the hourglass
                int numSpaces = i - middle;
                for (int j = 1; j <= numSpaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= height - 2 * numSpaces; j++) {
                    System.out.print("8");
                }
                System.out.println();
            }
        }

    }
}
