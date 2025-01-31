public class MoveZerosToRight {
    public static void MoveZeros(int arr[]) {
        int temp[] = new int[arr.length], j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            } else {
                continue;
            }
        }
        for (int i = j; i < arr.length; i++) {
            temp[j] = 0;
            j++;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 4, 5, 0, 6, 0, 4, 5 };
        MoveZeros(arr);
    }
}
 