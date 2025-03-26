public class Test {
    public static void duplicate(int num[]) {
        System.out.print("Array=");
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.print(" "+num[i]);
                }
            }

        }
    }

    public static void main(String args[]) {
        int num[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        duplicate(num);
    }
}