import java.util.Arrays;
import java.util.Scanner;

public class ReplacingElements1473A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String ans[]=new String[t];
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt(); int d=sc.nextInt();
            sc.nextLine();
            int arr[]=new int[n];
            int count1=0;
            for (int j = 0; j < n ; j++) {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            if (arr[n-1]<=d || arr[0]+arr[1]<=d){
                ans[i]="YES";
            }else{
                ans[i]="NO";
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
