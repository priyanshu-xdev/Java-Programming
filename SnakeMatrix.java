public class SnakeMatrix {

    public static void main(String[] args) {
        int start = 2;
        int row = 4;
        int col = 5;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = start;
                start += 2;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    System.out.printf("%3d ", arr[i][j]);
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
