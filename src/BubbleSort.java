import java.util.Arrays;

public class BubbleSort implements SortingAlgorithms {
    @Override
    public int[] sorty(int[] input) {
        int n = input.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
        int[] input = {5, 7, 1, 9, 3, 2, 6};
        System.out.println("Input: " + Arrays.toString(input));
        sorter.sorty(input);
        System.out.println("Output: " + Arrays.toString(input));
    }
}
