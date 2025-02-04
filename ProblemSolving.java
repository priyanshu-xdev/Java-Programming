public class ProblemSolving {
    public static void Sorting(int arr[]) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int result[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;

            } else if (arr[i] == 2) {
                count2++;

            }
        }
        for (int i = 0; i < count0; i++) {
            result[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            result[i] = 1;
        }
        for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
            result[i] = 2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + result[i]);
        }
        // System.out.println(count0);
        // System.out.println(count1);
        // System.out.println(count2);
    }

    // public static void swap(int a, int b) {
    // a = a + b;
    // b = a - b;
    // a = a - b;

    // }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 0, 1, 2, 2, };
        Sorting(arr);

    }
}
