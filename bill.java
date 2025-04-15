import java.util.*;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Of Pencil:");
        float a = sc.nextFloat();
        System.out.println("Enter Cost Of Pen:");
        float b = sc.nextFloat();
        System.out.println("Enter Cost Of Eraser:");
        float c = sc.nextFloat();
        float sum = a + b + c;
        System.out.println("Total Bill=" + sum);
        float gst = 0.18f * sum;
        System.out.println("GST is=" + gst);
        float total = sum + gst;
        System.out.println("Total Bill after GST is=" + total);
        sc.close();
    }
}
