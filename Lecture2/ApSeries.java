import java.util.Scanner;
public class ApSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int d=sc.nextInt();
        for (int i=0;i<50;i++){
            System.out.print(a+"");
            a+=d;
        }

    }
}