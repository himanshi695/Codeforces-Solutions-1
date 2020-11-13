import java.util.Scanner;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int k[] = new int[n];
        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
        }
        int max = 0;
        int count = 1;
        for (int i = 1; i <= n ; i++) {
            if (k[i] >= k[i - 1]) {
                count++;
                if (count > max) {
                    max = count;
                }

            } else {

                count = 1;
            }
        }
        System.out.println(max);
    }

}
