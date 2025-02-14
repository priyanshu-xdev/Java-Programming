import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            for (int j = 1; j < n; j++) {
                int result = sum + (int) Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            System.out.println();
            sc.close();
        }

    }
}
