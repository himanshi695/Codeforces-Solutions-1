import java.util.ArrayList;
import java.util.Scanner;

public class LongJumps1472C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int max[]=new int[t];
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt();
            sc.nextLine();
            int arr[]=new int[n];
            for (int j = 0; j < n ; j++) {
                arr[j]=sc.nextInt();
            }
            int al[]=new int[n];
            for (int j = n-1; j >=0 ; j--) {
                al[j]= arr[j];
                int k = j + arr[j];
                if (k < n) {
                    al[j]+=al[k];
                }
            }
            int mx= al[0];
            for (int j = 0; j < n ; j++) {
                if (mx<=al[j]){
                    mx=al[j];
                }
            }
            max[i]=mx;
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(max[i]);
        }
    }
}
