import javax.swing.*;
import java.util.Scanner;
public class LotteryPart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (n >= 300 && n <= 460) {
            System.out.println("won a mackbook");
            if (n >= 300 && n <= 380) {
                System.out.println("model:m1");
            } else if (n >= 381 && n <= 460) {
                System.out.println("model:m2");

            }
        }
    }
}
