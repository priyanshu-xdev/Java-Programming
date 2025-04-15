public class ReverseArray {

    public static void reverseArray(int arr[]) {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 7, 8, 9, 0 };
        reverseArray(arr);
        System.out.print("Reversed Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
