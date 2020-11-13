import java.util.Arrays;
import java.util.Scanner;

public class ArrayStablization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int k=n-1;
        int b[]=new int[k];
        for (int i = 0; i < n-1 ; i++) {
            b[i]=a[i];
        }
        Arrays.sort(b);
        System.out.println(b[k-1]-b[0]);
    }
}
