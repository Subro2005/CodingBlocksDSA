import java.util.Scanner;
public class Program21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=n;i>0;i=i/10){
            sum+=i%10;
//            i/=10;=> same as i =i/10;
        }
        System.out.println(sum);
    }
}
