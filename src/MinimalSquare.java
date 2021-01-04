import java.util.Scanner;

public class MinimalSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] q = new int[n];
        for (int i = 0; i < n ; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (a<b){
                    b=b;
                    q[i]=b*b;
            } else if (b<a*2){
                a=a*2;
                    q[i]=a*a;

            } else if (b==a){
                    q[i]=4*b*a;
            }
        }
        for (int i = 0; i < q.length ; i++) {
            System.out.println(q[i]);
        }
    }
}
