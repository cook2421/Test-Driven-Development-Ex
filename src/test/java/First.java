import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class First {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}

class Dollar{
    int amount = 10;

    Dollar(int amount){}

    void times(int multiplier){}
}
