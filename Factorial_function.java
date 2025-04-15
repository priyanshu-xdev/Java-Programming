// import java.util.*;

public class Factorial_function {

    
    public static int Fact(int n) {
        int facts = 1;
        for (int i = 1; i <= n; i++) {
            facts = facts * i;
        }
        // System.err.println(facts);
        return facts;
    }

    public static int bioco(int n,int r){
        int n_fact=Fact(n);
        int r_fact=Fact(r);
        int n_rfact=Fact(n-r);
        int bioco=n_fact/(r_fact*n_rfact);
        return bioco;
    }
    
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number:");
        // int n = sc.nextInt();
        // Fact(n);
        int x=bioco(5, 2);
        System.out.println(x);
        // sc.close();
    }
}
