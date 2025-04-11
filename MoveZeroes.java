import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        String str = "1100110101";
        int k = 3;
        int count = 0;
        char arr[] = str.toCharArray();
        int m = 1;
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= n - k; i++) {
            if (arr[i] == '0') {
                for (int j = i; j < i + k; j++) {
                    arr[j] = (arr[j] == '0') ? '1' : '0';
                }
                System.out.println(Arrays.toString(arr) + " = " + m);
                count++;
                m++;
            }
        }

        // System.out.println(count);
        // System.out.println(Arrays.toString(arr));
    }
}
