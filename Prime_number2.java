public class Prime_number2 {

    public static boolean prime(int n) {
        // boolean nprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void prime_range(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        prime_range(10);
    }
}
