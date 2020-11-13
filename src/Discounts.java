import java.util.Arrays;
import java.util.Scanner;

public class Discounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int arr[]=new int[n];
        int sum=0;
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int k=sc.nextInt();
        sc.nextLine();
        int ar[]=new int[k];
        for (int i = 0; i < k ; i++) {
            ar[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < k ; i++) {
            System.out.println(sum-arr[n-ar[i]]);
        }
    }
}
