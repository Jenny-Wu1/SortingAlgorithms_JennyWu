import java.util.Random;

public class Tester {
    private SortingAlgorithms sa;
    public Tester(SortingAlgorithms sa) {
        this.sa = sa;
    }

    public double singleTest(int size) {
        int[] input = new int[size];
        Random gen = new Random();
        for (int i = 0; i < size; i++) {
            input[i] = gen.nextInt();
        }

        long startTime = System.nanoTime();
        sa.sorty(input);
        long endTime = System.nanoTime();
        return (endTime - startTime)/1000000;
    }

    public void test(int iterations, int size) {
        double totalTime = 0;
        for (int i = 0; i < iterations; i++) {
            totalTime += singleTest(size);
        }
        System.out.print((totalTime / iterations) + " ms (avg)\n");
    }
}
