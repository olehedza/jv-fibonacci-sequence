package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FibonacciSequenceTest {
    private int[] fibonacciSequence = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,
            610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368};

    @Test
    public void getFibonacciSequence() {
        FibonacciSequence sequence = new FibonacciSequence();
        for (int i = 0; i < 20; i++) {
            int[] temp = fibonacciSequence;
            int[] actualResult = sequence.getFibonacciSequence(i);
            int[] expectedResult = Arrays.copyOf(temp, i);
            Assert.assertArrayEquals(
                    "Test failed with parameter: " + i, expectedResult, actualResult);
        }
    }
}
