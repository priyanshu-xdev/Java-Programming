public class SringCompare {
    public static void main(String args[]) {
        String s1 = "Priyanshu";
        String s2 = new String("Priyanshu");

        if (s1 == s2) {
            System.out.println("Strings Are Equal");
        } else {
            System.out.println("String are Not Equal");
        }
        // .equals function checks for equality
        if (s1.equals(s2)) {
            System.out.println("Strings Are Equal");
        } else {
            System.out.println("String are Not Equal");
        }
    }
}
