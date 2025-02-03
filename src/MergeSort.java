import java.util.Arrays;

public class MergeSort implements SortingAlgorithms {
    @Override
    public int[] sorty(int[] input) {
        mergeSort(input, 0, input.length - 1);
        return input;
    }

    private void merge(int[] input, int i, int j, int k) {
        int mergedSize = k - i + 1;
        int[] mergedNums = new int[mergedSize];
        int mergePosition = 0;
        int leftPosition = i;
        int rightPosition = j + 1;

        while (leftPosition <= j && rightPosition <= k) {
            if (input[leftPosition] <= input[rightPosition]) {
                mergedNums[mergePosition] = input[leftPosition];
                leftPosition++;
            } else {
                mergedNums[mergePosition] = input[rightPosition];
                rightPosition++;
            }
            mergePosition++;
        }

        while (leftPosition <= j) {
            mergedNums[mergePosition] = input[leftPosition];
            leftPosition++;
            mergePosition++;
        }

        while (rightPosition <= k) {
            mergedNums[mergePosition] = input[rightPosition];
            rightPosition++;
            mergePosition++;
        }

        for (mergePosition = 0; mergePosition < mergedSize; mergePosition++) {
            input[i + mergePosition] = mergedNums[mergePosition];
        }
    }

    private void mergeSort(int[] input, int i, int k) {
        int j = 0;
        if (i < k) {
            j = (i + k) / 2;
            mergeSort(input, i, j);
            mergeSort(input, j + 1, k);
            merge(input, i, j, k);
        }
    }
}
