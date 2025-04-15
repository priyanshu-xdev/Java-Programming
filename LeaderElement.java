public class LeaderElement {
    public static void leader(int arr[]) {
        int leader = arr[arr.length - 1];
        System.out.println();
        System.out.print("Leaders: ");
        System.out.print(leader);
        int count = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > leader) {
                leader = arr[i];
                System.out.print(" " + leader);
                count += 1;
            }
        }
        System.out.println();
        System.out.println("Total Leaders:" + count);
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 10, 7, 9, 8 };
        leader(arr);
    }
}
