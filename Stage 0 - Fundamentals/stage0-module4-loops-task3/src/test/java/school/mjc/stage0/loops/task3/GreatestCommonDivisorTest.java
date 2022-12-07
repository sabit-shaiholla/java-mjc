package school.mjc.stage0.loops.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class GreatestCommonDivisorTest extends BaseIOTest {

    @Test
    void printGCDFirstIsBigger() {
        GreatestCommonDivisor divisor = new GreatestCommonDivisor();

        divisor.printGCD(30, 25);

        assertOutEquals("5\n");
    }

    @Test
    void printGCDSecondIsBigger() {
        GreatestCommonDivisor divisor = new GreatestCommonDivisor();

        divisor.printGCD(25, 30);

        assertOutEquals("5\n");
    }

    @Test
    void printGCDWhenEqual() {
        GreatestCommonDivisor divisor = new GreatestCommonDivisor();

        divisor.printGCD(30, 30);

        assertOutEquals("30\n");
    }

    @Test
    void printGCDWhenZero() {
        GreatestCommonDivisor divisor = new GreatestCommonDivisor();

        divisor.printGCD(0, 30);

        assertOutEquals("30\n");
    }
}