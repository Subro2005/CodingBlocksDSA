import java.util.Scanner;
public class LotteryPart2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        if (n > 300 && n <= 460) {
            System.out.println("TH price is macbook");
        } else if
        (n >= 200 && n <= 200) {
            System.out.println("The price is kurkure");

        } else if
        (n > 1100 && n <= 1500) {
            System.out.println("the price is cycle");
        } else if
        (n > 50 && n <= 80) {
            System.out.println("the price is bike");
        } else {
            System.out.println("Better luck next time");
        }
    }
}
