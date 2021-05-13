import java.util.Scanner;

public class SumOf2050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            long n=sc.nextLong();
            sc.nextLine();
            if (n%2050==0){
                n=n/2050;
                int ans=0;
                while (n>0){
                    ans+=n%10;
                    n=n/10;
                }
                System.out.println(ans);
            } else {
                System.out.println("-1");
            }
        }
    }
}
