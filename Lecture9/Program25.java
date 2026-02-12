import java.util.Scanner;
public class Program25 {
    public static void Check(int a){
        if(a%2==0){
            System.out.println(a+" even");
        }else{
            System.out.println(a+" odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Check( a);

    }
}