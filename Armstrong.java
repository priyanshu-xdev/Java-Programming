public class Armstrong {
    public static void arm(int n) {
        int r, sum = 0, m;
        m = n;
        int length = 0;
        while (n > 0) {
            n = n / 10;
            length++;
        }
        n=m;
        while (n > 0) {
            r = n % 10;
            sum = sum + (int) Math.pow(r, length);
            n = n / 10;
        }
        if (sum == m) {
            System.out.println(m + " is a Armstrong Number");
        } else {
            System.out.println(m + " is not a Armstrong Number");
        }
    }

    public static void main(String[] args) {
        arm(153);
    }
}
