public class string {

    public static void find() {
        char arr[] = new char[26];
        for (int i = 0; i < 26; i++) {
            int num = 97 + i;
            char ch = (char) num;
            arr[i] = ch;
        }
        for (int i = 0; i < 26; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(" "+arr[i]);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        find();
        // int a=97;
        // char ch=(char)a;
        // System.out.println(ch);
    }
}
