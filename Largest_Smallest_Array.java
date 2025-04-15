public class Largest_Smallest_Array {
    public static void Largest_Smallest(int arr[]) {
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest in Array is:" + largest);
        System.out.println("Smallest in Array is:" + smallest);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 4, 7, 5, 0, 9 };
        Largest_Smallest(arr);
    }
}
