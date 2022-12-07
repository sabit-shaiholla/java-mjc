package school.mjc.stage0.loops.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class RangeSumTest extends BaseIOTest {

    @Test
    void printSumPrintsSumWhenSecondIsBigger() {
        RangeSum sum = new RangeSum();

        sum.printSumInclusive(1, 10);

        assertOutEquals("55\n");
    }

    @Test
    void printSumPrintsSumWhenEqual() {
        RangeSum sum = new RangeSum();

        sum.printSumInclusive(100, 100);

        assertOutEquals("100\n");
    }

    @Test
    void printSumPrintsSumWhenModulo() {
        RangeSum sum = new RangeSum();

        sum.printSumInclusive(-100, 100);

        assertOutEquals("0\n");
    }
}