package school.mjc.stage0.loops.task2;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest extends BaseIOTest {

    @Test
    public void printPowerTestPrintsUpTo16() {
        String expected =
                "1\n" +
                "2\n" +
                "4\n" +
                "8\n" +
                "16\n";
        PowerOfTwo powerOfTwo = new PowerOfTwo();

        powerOfTwo.printPower(4);

        assertEquals(expected, updateLineSpliterators(outContent.toString()));
    }

    @Test
    public void printPowerTestPrintsUpTo1() {
        String expected = "1\n";
        PowerOfTwo powerOfTwo = new PowerOfTwo();

        powerOfTwo.printPower(0);

        assertOutEquals(expected);
    }

    @Test
    public void printPowerTestNegative() {
        String expected = "too much power\n";
        PowerOfTwo powerOfTwo = new PowerOfTwo();

        powerOfTwo.printPower(-9);

        assertOutEquals(expected);
    }
}