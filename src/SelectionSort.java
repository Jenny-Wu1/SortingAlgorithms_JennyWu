import java.util.Arrays;

public class SelectionSort implements SortingAlgorithms {
    @Override
    public int[] sorty(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int minIndex = i;
            for (int j = i; j < input.length; j++) {
                if (input[minIndex] > input[j]) {
                    minIndex = j;
                }
            }
            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }
        return input;
    }

    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();
        int[] input = {5, 7, 1, 9, 3, 2, 6};
        System.out.println("Input: " + Arrays.toString(input));
        sorter.sorty(input);
        System.out.println("Output: " + Arrays.toString(input));
    }
}
