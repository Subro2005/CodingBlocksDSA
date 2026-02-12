import java.util.Scanner;
public class Program23 {

    public static void sumEven(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {   // check even number
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers = " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        sumEven(n);
    }
}