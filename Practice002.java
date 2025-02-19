public class Practice002 {
    public static void main(String args[]) {

        int n = 3;
        int isPrime = 1;
        if (n == 2) {
            System.out.println("Prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = 0;
                break;
            }
        }
        if (isPrime > 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
