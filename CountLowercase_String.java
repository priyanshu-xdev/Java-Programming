public class CountLowercase_String {
    public static void main(String args[]) {
        String str = "Appple is tasty";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
