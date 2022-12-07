package school.mjc.stage0.loops.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class AlphabetPrinterTest extends BaseIOTest {

    @Test
    void printAlphabet() {
        String expected = "a\n" +
                "b\n" +
                "c\n" +
                "d\n" +
                "e\n" +
                "f\n" +
                "g\n" +
                "h\n" +
                "i\n" +
                "j\n" +
                "k\n" +
                "l\n" +
                "m\n" +
                "n\n" +
                "o\n" +
                "p\n" +
                "q\n" +
                "r\n" +
                "s\n" +
                "t\n" +
                "u\n" +
                "v\n" +
                "w\n" +
                "x\n" +
                "y\n" +
                "z\n" ;

        AlphabetPrinter printer = new AlphabetPrinter();

        printer.printAlphabet();

        assertOutEquals(expected);
    }
}