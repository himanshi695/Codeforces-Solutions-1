import java.util.Scanner;

public class GiftsFixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        long[] k = new long[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < n ; j++) {
                b[j] = sc.nextInt();
            }
            int min1 = a[0];
            for (int j = 0; j < a.length; j++) {
                if (a[j] < min1) {
                    min1 = a[j];
                }
            }
            int min2 = b[0];
            for (int j = 0; j < b.length; j++) {
                if (b[j] < min2) {
                    min2 = b[j];
                }
            }
            long count = 0;
            for (int j = 0; j < n; j++) {
                while (min1 != a[j] && min2 != b[j]) {
                    if (a[j]>min1 && b[j]>min2){
                        count++;
                        a[j]--;
                        b[j]--;
                    }
                }
            }
            for (int j = 0; j < n ; j++) {
                if (a[j]>min1){

                    count+=(a[j]-min1);
                }
            }
            for (int j = 0; j < n ; j++) {
                if (b[j]>min2){

                    count+=(b[j]-min2);
                }
            }


            k[i]= count;

        }
        for (int m = 0; m < k.length ; m++) {
            System.out.println(k[m]);
    }

}}