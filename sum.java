import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        // System.out.println("Enter Second Number");
        // int b = sc.nextInt();
        double pie = 3.14;
        double area = pie * a * a;
        System.out.println("There Area Is : " +area);
        sc.close(); 
    }
}
