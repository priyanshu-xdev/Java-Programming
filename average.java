import java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c = sc.nextInt();
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println("Average is:" + avg);
        sc.close();
    }
}
