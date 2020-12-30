import java.util.Arrays;
import java.util.Scanner;

public class AandBandCompilations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int a = 0,b=0,c=0;
        long arr1[]=new long[n];
        long arr2[]=new long[n-1];
        long arr3[]=new long[n-2];
        for (int i = 0; i < n ; i++) {
            arr1[i]=sc.nextInt();
            a+=arr1[i];
        }
        for (int i = 0; i < n-1 ; i++) {
            arr2[i]=sc.nextInt();
            b+=arr2[i];
        }
        for (int i = 0; i < n-2 ; i++) {
            arr3[i]=sc.nextInt();
            c+=arr3[i];
        }
        System.out.println(a-b);
        System.out.println(b-c);

    }
}
