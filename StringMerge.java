public class StringMerge {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "pqrs";
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            sb.append(str1.charAt(i++));
            sb.append(str2.charAt(j++));
        }
        sb.append(str1.substring(i));
        sb.append(str2.substring(j));
        System.out.println(sb);
    }
}
