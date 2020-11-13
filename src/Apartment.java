import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int sol[]=new int[n];
        for (int i = 0; i < n ; i++) {
            int sum = 2;
            int k = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            int o = 1;
            if (k == 1 || k == 2) {
                sol[i] = 1;
            } else {
                while (true) {

                    sum = sum + m;
                    o++;
                    if (k <= sum) {
                        sol[i] = o;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(sol[i]);
        }
    }
}
