import java.util.ArrayList;
import java.util.Random;

public class KSortedTest {
    private SortingAlgorithms sa;
    public KSortedTest(SortingAlgorithms sa) {
        this.sa = sa;
    }

    private void generateKSorted(int[] input) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= input.length; i++) {
            numbers.add(i);
        }

        Random gen = new Random();
        for (int i = 0; i < input.length; i++) {
            int maxIndex = Math.min(10, numbers.size());
            int selectedIndex = gen.nextInt(maxIndex);
            input[i] = numbers.remove(selectedIndex);
        }
    }

    public double singleTest(int size) {
        int[] input = new int[size];
        generateKSorted(input);

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
