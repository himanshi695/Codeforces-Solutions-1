import java.util.Arrays;
import java.util.Scanner;

public class YetAnotherTetrisProblem {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String[] a=new String[t];
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt();
            sc.nextLine();
            int arr[]=new int[n];
            long aa=0, bb=0;
            for (int j = 0; j < n ; j++) {
                arr[j]=sc.nextInt();
                if (arr[j]%2==0){
                    aa++;
                } else{
                    bb++;
                }
            }
            Arrays.sort(arr);
            if (aa>0 && bb>0){
                a[i]="NO";
            } else{
                a[i]="YES";
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(a[i]);
        }
    }
}
