public class Alternate_evenodd {

    public static void series(int arr[]) {
        int odd[] = new int[arr.length];
        int even[] = new int[arr.length];
        int even1 = 0;
        int odd1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[even1] = arr[i];
                even+2;
            } else {
                odd[odd1] = arr[i];
                
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[2 * i] = even[i];
            arr[2 * i + 1] = odd[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 5, 6, 7, 8, 3, 5 };
        series(arr);
    }
}
