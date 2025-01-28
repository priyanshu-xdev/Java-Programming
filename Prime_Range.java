public class Prime_Range {

    public static int prime(int n) {
        // boolean nprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void prime_range(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)==1) {
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        prime_range(40);
    }
}
