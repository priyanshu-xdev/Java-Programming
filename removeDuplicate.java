import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int count = 0;
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boolean found=false;
            for (int j = 0; j < count; j++) {
                if (arr[j] == nums[i]) {
                    found = true;
                    break;
                }
            }
                if (!found) {
                    arr[count] = nums[i];
                    count++;
                }
        }
        System.out.print(count);
        System.out.println();
        for(int i=0;i<count;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
