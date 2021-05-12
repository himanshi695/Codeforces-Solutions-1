import java.util.Scanner;

public class TheCakeIsALie1519B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0){
            int n=sc.nextInt(); int m=sc.nextInt(); int k=sc.nextInt();
            sc.nextLine();
            if (n==1 && m==1) {
                if (k==0){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            } else if (n==1 || m==1){
                if (Math.abs(n-m)==k){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            } else{
                int p=(n-1)*1+(m-1)*n;
                int q=(m-1)*1+(n-1)*m;
                if (p==k || q==k){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
