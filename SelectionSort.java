public class SelectionSort {
    public static void sorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 8, 4, 2, 0, 1 };
        sorting(arr);
    }
}
