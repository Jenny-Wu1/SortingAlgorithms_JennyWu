import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class Performance {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        List<SortingAlgorithms> algorithms = Arrays.asList(
                new BubbleSort(), new InsertionSort(), new SelectionSort(),
                new ShellSort(), new QuickSort(), new MergeSort()
        );
        try (PrintStream fileOut = new PrintStream("Performance_report.txt")) {
            PrintStream consoleOut = System.out;
            System.setOut(fileOut);

            for (SortingAlgorithms algorithm : algorithms) {
                System.out.println("Sorting algorithm - " + algorithm.getClass().getName());

                Tester tester = new Tester(algorithm);
                for (int size : sizes) {
                    System.out.print("Sorted " + size + " elements in ");
                    tester.test(20, size);
                }
                System.out.println();
            }
            System.setOut(consoleOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
