import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        String str = "1100110101";
        int k = 3;
        // int count = 0;
        char nums[] = str.toCharArray();
        int m = 1;
        int n = nums.length;
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i <= n - k; i++) {
            if (nums[i] == '0') {
                for (int j = i; j < i + k; j++) {
                    nums[j] = (nums[j] == '0') ? '1' : '0';
                }
                System.out.println(Arrays.toString(nums) + " = " + m);
                // count++;
                m++;
            }
        }

        // System.out.println(count);
        // System.out.println(Arrays.toString(arr));
    }
}
