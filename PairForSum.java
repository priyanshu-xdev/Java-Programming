public class PairForSum {

    public static void pair(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2,3,4,5,6,7,8};
        int target = 10;
        pair(arr, target);
    }
}
