import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LunarNewYearAndNumberDivision1106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int arr[]=new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
        }
        int arr2[]=new int[n/2];
        Arrays.sort(arr);
        int k=n-1;
        for (int i = 0; i < n/2 ; i++) {
            arr2[i]=arr[i]+ arr[k];
            k--;
        }
        long sum=0;
        for (int i = 0; i < arr2.length ; i++) {
            sum=sum+(arr2[i]*arr2[i]);
        }
        System.out.println(sum);
    }
}
