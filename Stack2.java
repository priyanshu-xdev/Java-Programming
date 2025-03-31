public class Stack2 {
    public static void main(String[] args) {
        String s = "({[()]})";
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        if (s.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
