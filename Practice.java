import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = { { 1, 2, 6 }, { 4, 5, 6 }, { 6, 5, 2 } };
        int key = 6;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println(count);

        sc.close();
    }
}
