public class InsertPosition {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 8 };
        int target = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
            }
            if (target > arr[i] && target < arr[i + 1]) {
                System.out.println((i + 1));
            }
        }
    }
}
    