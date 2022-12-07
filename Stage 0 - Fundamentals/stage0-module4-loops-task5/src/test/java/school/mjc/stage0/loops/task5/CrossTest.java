package school.mjc.stage0.loops.task5;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class CrossTest extends BaseIOTest {

    @Test
    void printCross() {
        String expected = "  8  \n" +
                "  8  \n" +
                "88888\n" +
                "  8  \n" +
                "  8  \n";

        Cross cross = new Cross();

        cross.printCross(5);

        assertOutEquals(expected);
    }

    @Test
    void printCrossPrintsMinCross() {
        String expected = " 8 \n" +
                "888\n" +
                " 8 \n";

        Cross cross = new Cross();

        cross.printCross(3);

        assertOutEquals(expected);
    }

    @Test
    void printCrossPrintsNothing() {
        String expected = "";

        Cross cross = new Cross();

        cross.printCross(0);

        assertOutEquals(expected);
    }
}