import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int nums2[] = { 2, 5, 6 };
        int n = 3;
        int nums3[] = new int[m + n];
        for (int i = 0; i < nums3.length; i++) {
            if (nums1[i] != 0) {
                nums3[i] = nums1[i];
            }
            int k = 0;
            for (int j = m; j < nums3.length; j++) {
                if (nums2[k] != 0) {
                    nums3[j] = nums2[k];
                    k++;
                }
            }
        }
        Arrays.sort(nums3);
        System.out.print(Arrays.toString(nums3));
    }
}
