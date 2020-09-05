import java.util.Scanner;

public class AddAndSubtractEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int[] k= new int[t];
        for (int i = 0; i < t ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            int count = 0;
            if (b > a) {
                int c = b - a;
                if (c % 2 != 0) {
                    count++;
                } else {
                    count += 2;
                }
            } else if (a > b) {
                int c = a - b;
                if (c % 2 == 0) {
                    count++;
                } else {
                    count += 2;
                }
            } else if (a == b) {
                count = 0;
            }
            k[i]=count;

        }
        for (int i = 0; i < t ; i++) {
            System.out.println(k[i]);
        }
    }
}
