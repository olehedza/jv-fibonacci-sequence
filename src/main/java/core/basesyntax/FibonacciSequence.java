package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {

        int x1 = 0;
        int x2 = 1;
        int[] result = new int[n];
        for (int i = 0; i < n; ++i) {
            result[i] = x1;
            int sum = x1 + x2;
            x1 = x2;
            x2 = sum;
        }
        return result;
    }
}
