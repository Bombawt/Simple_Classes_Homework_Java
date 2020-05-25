import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void getVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drink(){
        assertEquals(90, waterbottle.drink(10));
    }

    @Test
    public void empty(){
        assertEquals(0, waterbottle.empty());
    }

    // I feel like this maybe isn't the way we were meant to do it? Perhaps by spamming the drink method? But it was
    // a bit ambiguous in the homework brief.

    @Test
    public void fill(){
        assertEquals(100, waterbottle.fill());
    }
}
