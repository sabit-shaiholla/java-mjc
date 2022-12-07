package school.mjc.stage0.loops.task2;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class EvenNumbersPrinterTest extends BaseIOTest {
    @Test
    void printEvenNumbersPrinterPrintsTill9() {
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();

        evenNumbersPrinter.printEvenNumbers(9);

        assertOutEquals("0\n2\n4\n6\n8\n");
    }

    @Test
    void printEvenNumbersPrinterPrintsTill20() {
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();

        evenNumbersPrinter.printEvenNumbers(20);

        assertOutEquals("0\n2\n4\n6\n8\n10\n12\n14\n16\n18\n20\n");
    }

    @Test
    void printEvenNumbersPrinterPrints0() {
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();

        evenNumbersPrinter.printEvenNumbers(0);

        assertOutEquals("0\n");
    }
}
