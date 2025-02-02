import java.util.Arrays;

public class ShellSort implements SortingAlgorithms {
    @Override
    public int[] sorty(int[] input) {
        int n = input.length;
        int temp;
        int j;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                temp = input[i];
                for (j = i; j >= gap && temp < input[j - gap]; j -= gap) {
                    input[j] = input[j - gap];
                }
                input[j] = temp;
            }
        }
        return input;
    }
}
