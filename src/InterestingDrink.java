import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        long k=sc.nextLong();
        sc.nextLine();
        long ans[]=new long[(int) k];
        for (int i = 0; i < k ; i++) {
            int money = sc.nextInt();
            sc.nextLine();
            long count = 0;
            ans[i] = binarySearch(arr, money);
        }
        for (int i = 0; i < k ; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int binarySearch(int arr[], int x)
    {
        int left = 0;
        int right = arr.length - 1;

        int count = 0;

        while (left <= right)
        {
            int mid = (right + left) / 2;
            if (arr[mid] <= x)
            {
                count = mid + 1;
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return count;
    }
}
