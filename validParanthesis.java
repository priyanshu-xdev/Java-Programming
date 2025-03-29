public class validParanthesis {
    public static boolean isValid(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        boolean result = isValid(s);
        System.out.println(result);
    }
}
