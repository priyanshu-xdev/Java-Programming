public class SizeK_SubArray {
    public static void sizeK_subArray(int arr[], int size) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - size; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                sum = sum + arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }

    public static void maxSubarray(int arr[],int size){
        
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int size = 3;
        sizeK_subArray(arr, size);
    }
}