import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {
    Problem1 testObj = new Problem1();

    @Test
    void hasNumbers() {
        int[] arr = { 4, 7, 2, 4};
        Assertions.assertEquals(true, testObj.hasNumbers(8, arr));
    }

    @Test
    void isTwoNumberSum() {
        int[] arr = { 4, 7, 2, 4};
        Assertions.assertEquals(true, testObj.hasNumbers(8, arr));
    }
}