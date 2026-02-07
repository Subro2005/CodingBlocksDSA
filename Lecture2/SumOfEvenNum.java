public class SumOfEvenNum {
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        for (int i=n;i>=1;i--){
            if (i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
