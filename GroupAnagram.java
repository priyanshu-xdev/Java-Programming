import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(Arrays.toString(strs));
        for (int i = 0; i < strs.length; i++) {
            String key = strs[i];
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            strs[i] = new String(arr);
            System.out.println(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                char[] arr2 = strs[j].toCharArray();
                Arrays.sort(arr2);
                strs[j] = new String(arr2);
                if (strs[i].equals(strs[j])) {
                    System.out.print(key);
                }
            }
        }
    }
}
