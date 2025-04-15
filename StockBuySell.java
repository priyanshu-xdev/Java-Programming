public class StockBuySell {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int low = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            low = Math.min(low, arr[i]);
            if (arr[i] > low) {
                profit = Math.max(profit, arr[i] - low);
            }
        }
        System.out.println(profit);
    }
}
