import java.util.Scanner;

public class CandiesDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int sol[] = new int[t];
        for (int i = 0; i < t ; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            if (n % k == 0) {
                sol[i] = n;
            } else {
                int p = n % k;
                int q = n - p;
                int o = k / 2;
                q = q + Math.min(p,o);
                sol[i] = q;
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(sol[i]);
        }
    }
}
