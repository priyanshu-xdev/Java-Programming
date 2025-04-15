public class avg3Num {
    public static void avgNum(int a, int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        System.out.println("Average:"+avg);
        return ;
    }

    public static void main(String args[]){
        avgNum(2,5,15);
    }
}
