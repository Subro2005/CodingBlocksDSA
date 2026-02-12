public class Program12{
    public static void main(String[] args) {
        int n=4;
        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("*");
            }
            for (int k=0;k<2*i;k++){
                System.out.print(" ");
            }
            for (int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}