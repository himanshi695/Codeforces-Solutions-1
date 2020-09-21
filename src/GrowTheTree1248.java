import java.util.Arrays;
import java.util.Scanner;

public class GrowTheTree1248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            Arrays.sort(arr);
            long sum = 0;
            long sum2 = 0;
            if (n % 2 == 0) {
                for (int i = 0; i < (n / 2); i++) {
                    sum = sum + arr[i];
                }
                for (int i = n / 2; i < n; i++) {
                    sum2 = sum2 + arr[i];
                }
            } else {
                for (int i = 0; i < (n / 2); i++) {
                    sum = sum + arr[i];
                }
                for (int i = n / 2; i < n; i++) {
                    sum2 = sum2 + arr[i];
                }
            }
            System.out.println((sum * sum) + (sum2 * sum2));
    }
}
