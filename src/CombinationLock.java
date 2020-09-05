import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class CombinationLock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int d=sc.nextInt();
        sc.nextLine();
        int a=sc.nextInt();
        sc.nextLine();
        int b=sc.nextInt();
        sc.nextLine();
        int moves=0;
        for (int i = 0; i < d ; i++) {
            int p=a%10;
            a=a/10;
            int q=b%10;
            b=b/10;
            int max=Math.max(p,q);
            int min=Math.min(p,q);
            int k=max-min;
            int l=(10-max)+min;
            int min1=Math.min(k,l);
            moves=moves+min1;
        }
        System.out.println(moves);
    }
}
