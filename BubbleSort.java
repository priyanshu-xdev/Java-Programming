public class BubbleSort {
    public static void sorting(int n, int arr[]) {
        boolean isSwap;
        for (int i = 0; i < n; i++) {
            isSwap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (isSwap == false) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int arr[] = { 1, 4, 6, 8, 3, 7, 8 };
        sorting(n, arr);
    }
}
