public class Palindrome {
    public static void palindrome(int n){
        int sum=0;
        int r;
        // int num=n;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
        // if(rev==num){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }
        return;
    }

    public static void main(String args[]){
        palindrome(3625);
    }
}
