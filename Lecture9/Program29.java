public class Program29 {
    public static void interest(int p,int r, int t){
        int si=(p*r*t)/100;
        System.out.println(si);
    }

    public static void main(String[] args) {
        int p=19;
        int r=9;
        int t=10;
        interest(p,r,t);
    }
}