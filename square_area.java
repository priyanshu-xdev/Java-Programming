import java.util.*;

public class square_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of a Square");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of Square is :" + area);
        sc.close();
    }
}
