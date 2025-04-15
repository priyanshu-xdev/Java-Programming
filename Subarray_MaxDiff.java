public class Subarray_MaxDiff {

    public static void maxdiff(int arr[], int size) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - size; i++) {
            int diff = arr[i + size - 1] - arr[i];
            if (max < diff) {
                max = diff;
            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 10 };
        int size = 3;
        maxdiff(arr, size);
    }
}
