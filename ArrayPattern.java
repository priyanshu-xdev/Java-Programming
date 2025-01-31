public class ArrayPattern {

    public static void patternArray(int arr[]) {
        // int subarray[]=new int[arr.length];
        int n = 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print("Array " + n + " = ");
            for (int j = i; j < arr.length; j++) {

                System.out.print(arr[j] + " ");
            }
            n += 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 4, 3 };
        patternArray(arr);
    }
}
