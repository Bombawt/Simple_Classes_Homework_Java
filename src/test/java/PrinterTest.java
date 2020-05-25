import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(0, 0, 25);
    }

    @Test
    public void printSuccessful(){
        assertEquals("There are 5 sheets remaining.", printer.print(25, 20));
    }

    @Test
    public void printFailure(){
        assertEquals("Not enough paper!", printer.print(10, 14));
    }

//    @Test
//    public void tonerUsedTrue(){
//        assertEquals(15, printer.print(25, 10));
//    }
//
//    @Test
//    public void tonerUsedFalse(){
//        printer.print(10, 14);
//        assertEquals(25, printer.toner());
//    }

    // Yeah those tests won't work, how the hell do you get different value types out of one method? :/

}
