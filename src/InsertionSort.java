import java.util.Arrays;

public class InsertionSort implements SortingAlgorithms {
    @Override
    public int[] sorty(int[] input) {
        int temp;
        int j;
        for (int i = 1; i < input.length; i++) {
            temp = input[i];
            for (j = i; j > 0 && temp < input[j - 1]; j--) {
                input[j] = input[j - 1];
            }
            input[j] = temp;
        }
        return input;
    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] input = {5, 7, 1, 9, 3, 2, 6};
        System.out.println("Input: " + Arrays.toString(input));
        sorter.sorty(input);
        System.out.println("Output: " + Arrays.toString(input));
    }
}
