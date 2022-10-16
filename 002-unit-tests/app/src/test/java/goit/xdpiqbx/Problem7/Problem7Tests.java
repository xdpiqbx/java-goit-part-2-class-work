package goit.xdpiqbx.Problem7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem7Tests {
    @Test
    public void testThatRomeToArabicMethodWorksOkForI(){
        int actual = new Problem7().romeToArabic("I");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatRomeToArabicMethodWorksOkForII(){
        int actual = new Problem7().romeToArabic("II");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}