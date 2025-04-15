public class even {

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
   
   
    public static void main(String[] args) {
    boolean x=isEven(50);
    System.out.println(x);
}
}
