public class String_Uppercase {
    public static void main(String[] args) {
        String sc = "hi i am priyanshu !";
        StringBuilder st = new StringBuilder("");
        char ch = Character.toUpperCase(sc.charAt(0));
        st.append(ch);
        for (int i = 1; i < sc.length(); i++) {
            if (sc.charAt(i) == ' ' && i < sc.length() - 1) {
                st.append(sc.charAt(i));
                i++;
                st.append(Character.toUpperCase(sc.charAt(i)));
            } else {
                st.append(sc.charAt(i));
            }
        }
        System.out.println(st);
    }
}
