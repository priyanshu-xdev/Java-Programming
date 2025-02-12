import java.util.*;

public class String_Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String str = "noon";
        String str = sc.next();
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


        sc.close();
    }

}