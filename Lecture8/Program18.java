import java.util.Scanner;
public class Program18 {
    public static boolean prime(int n) {

        int count= 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;

            }
        }
        if (count == 2)
            return true;
        else
            return false;

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }

    }

}