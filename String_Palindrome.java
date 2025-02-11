public class String_Palindrome {
    public static void main(String[] args) {
        String str = "noon";
        int n = str.length();
        boolean isPrime = true;
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println(str + " " + "is a Palindrome");

        } else {

            System.out.println(str + " " + "is not a Palindrome");
        }
    }

}