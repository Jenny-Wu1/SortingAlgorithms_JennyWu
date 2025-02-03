import java.util.Arrays;

public class QuickSort implements SortingAlgorithms {
    @Override
    public int[] sorty(int[] input) {
        quicksort(input, 0, input.length - 1);
        return input;
    }

    private int partition(int[] input, int low, int high) {
        int midpoint = low + (high - low) / 2;
        int pivot = input[midpoint];
        int temp;

        boolean done = false;
        while (!done) {
            while (input[low] < pivot) {
                low++;
            }
            while (pivot < input[high]) {
                high--;
            }
            if (low >= high) {
                done = true;
            } else {
                temp = input[low];
                input[low] = input[high];
                input[high] = temp;
                low++;
                high--;
            }
        }
        return high;
    }

    private void quicksort(int[] input, int low, int high) {
        if (low >= high) {
            return;
        }
        int lowEnd = partition(input, low, high);
        quicksort(input, low, lowEnd);
        quicksort(input, lowEnd + 1, high);
    }

    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        int[] input = {5, 7, 1, 9, 3, 2, 6};
        System.out.println("Input: " + Arrays.toString(input));
        sorter.sorty(input);
        System.out.println("Output: " + Arrays.toString(input));
    }
}
