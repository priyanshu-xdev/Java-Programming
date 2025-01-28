public class Butterfly2 {
        public static void butter(int n) {
            int arr[] = {6, 4, 2, 0};
            for (int i = 1; i <= n; i++) {
                for (int k = 1; k <= arr[i - 1]; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    
        public static void main(String[] args) {
            butter(4);
        }
    }
    