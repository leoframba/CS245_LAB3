import java.util.Arrays;

public class MergeArrays {
    /**
     * Function that takes in two arrays arr1,arr2, and two integer m,n
     * merge m elements from arr1 and n elements from arr2 into arr1
     *
     * @param arr1 1st array of elements, has size of m+n
     * @param m    m elements to be merged,
     * @param arr2 2nd array of elements, has size of n
     * @param n    n elements to be merged
     */
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int indexM = m - 1;
        int indexN = n - 1;
        int index1 = arr1.length - 1;

        //Merge backwards until either of the two arrays is complete
        while (indexM >= 0 && indexN >= 0) {
            if (arr1[indexM] >= arr2[indexN]) arr1[index1--] = arr1[indexM--];
            if (arr1[indexM] < arr2[indexN]) arr1[index1--] = arr2[indexN--];
        }
        //Add what's left of the remaining array
        while (indexM >= 0) {
            arr1[index1--] = arr1[indexM--];
        }
        while (indexN >= 0) {
            arr1[index1--] = arr1[indexN--];
        }
    }

    public static void main(String[] args) {
        //Modify the main as needed to test
        MergeArrays ma = new MergeArrays();
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 7};
        int m = 3, n = 3;
        ma.merge(arr1, m, arr2, n);
        System.out.println("Expected: [1, 2, 2, 3, 5, 7]");
        System.out.println("Actual:   " + Arrays.toString(arr1));

    }
}