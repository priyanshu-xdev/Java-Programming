import java.util.*;
public class Even_odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value Of n:\n");
        int n = sc.nextInt();
        int even=0;
        int odd=0;
        while(n>0){
            int num= sc.nextInt();
            if(num%2==0){
                even =even + num;
            }
            else{
                odd = odd + num;
            }
            n--;
        }
        System.out.println("even:"+ even);
        System.out.println("odd:"+ odd);
        sc.close();
    }
}
