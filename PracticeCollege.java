public class PracticeCollege {
    int sum(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        PracticeCollege ob = new PracticeCollege();
        int res = ob.sum(3, 5);
        System.out.println(res);
        int res2 = ob.sum(res, 8);
        System.out.println(res2);
    }
}
