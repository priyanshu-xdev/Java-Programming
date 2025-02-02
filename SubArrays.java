public class SubArrays {
    public static void subArray(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(" " + arr[k] + " ");
                    sum = sum + arr[k];

                }
                if (sum > max) {
                    max = sum;
                } else if (sum < min) {
                    min = sum;
                }

                System.out.println(" = " + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Sum = " + max);
        System.out.println("Minimum Sum = " + min);
    }

    public static void kadanes(int arr[]) {
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            max = Math.max(currsum, max);
            if (currsum < 0) {
                currsum = 0;
            }
        }
        System.out.println("Maximum using kadanes: " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 2, 3, 4, 5 };
        subArray(arr);
        kadanes(arr);
    }
}
