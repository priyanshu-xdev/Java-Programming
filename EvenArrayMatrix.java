public class EvenArrayMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        int start = 2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = start;
                start += 2;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
