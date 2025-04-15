import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println("Factorial is :" + sum);
        sc.close();
    }
}
