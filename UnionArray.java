public class UnionArray {
    public static void Union(int arr1[], int arr2[], int result[]) {
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            result[k++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            int found = 0;
            for (int j = 0; j < k; j++) {
                if (result[j] == arr2[i]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                result[k++] = arr2[i];
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 5, 4, 3, 2, 1 };
        int arr2[] = { 1, 2, 9, 8, 7, 6 };
        int n = arr1.length + arr2.length;
        int result[] = new int[n];
        Union(arr1, arr2, result);
    }
}
