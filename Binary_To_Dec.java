public class Binary_To_Dec {
    public static void binToDec(int n){
        int mynum=n;
        int pow =0;
        int decNum=0;
        while(n>0){
            int lastDigit=n%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println("Decimal Of " + mynum +" = "+ decNum);

        return ;
    }

    public static void main(String[] args) {
        binToDec(10101);
    }
}
