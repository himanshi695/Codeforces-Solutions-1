import java.util.Scanner;

public class ChipaMoving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int a=0; int b=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]%2==0) {
                a++;
            } else{
                b++;
            }
        }
        System.out.println(Math.min(a,b));

    }
}
