import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        mergeSort(input, 0, input.length - 1);

        System.out.println(Arrays.toString(input).replaceAll("[\\[\\],]",""));

    }

    private static void mergeSort(int[] array, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }

        int middle = (startIndex + endIndex) / 2;

        mergeSort(array, startIndex, middle);

        mergeSort(array, middle + 1, endIndex);

        merge(array, startIndex, middle, endIndex);
    }

    private static void merge(int[] array, int startIndex, int middle, int endIndex) {
        if (middle < 0 || middle >= array.length - 1 || array[middle] <= array[middle + 1]) {
            return;
        }
        int [] helper = new int[array.length];

        if (endIndex + 1 - startIndex >= 0){
            System.arraycopy(array, startIndex, helper, startIndex, endIndex + 1 - startIndex);
        }

        int left = startIndex;
        int right = middle+1;

        for (int i = startIndex; i <=endIndex; i++) {
            if (left>middle){
                array[i] = helper[right++];
            }else if (right>endIndex){
                array[i] = helper[left++];
            }else if (helper[left]<= helper[right]){
                array[i] = helper[left++];
            }else {
                array[i] = helper[right++];
            }
        }
    }
}
