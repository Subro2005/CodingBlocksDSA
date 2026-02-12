import java.util.Scanner;
public class Program22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=10;
        int num=0;
        for (int i=n;i>0;i=i/10){// i>0 == i!=0

            num=num*x+(i%10);
//            i/=10;
        }
        System.out.print(num);
    }
}
