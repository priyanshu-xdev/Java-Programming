public class EvenArrayMatrix {
    public static void main(String[] args) {
        int start = 2;
        int row = 3;
        int col = 3;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = start;
                start += 2;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j < col; j++) {
            for (int i = row - 1; i >= 0; i--) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
