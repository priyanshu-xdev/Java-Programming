public class Pyramid {
    public static void main(String[] args) {
        
        int i,j,k;
        int n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
}
//         for(i=n-1;i>=1;i--){
//             for(j=n-1;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(k=(2*i-1);k>=1;k--){
//                 System.out.print("*");
//             }
//             System.out.println();
// }
}
}