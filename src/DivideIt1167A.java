import java.util.Scanner;

public class DivideIt1167A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int ans[]=new int[t];
        for (int i = 0; i < t ; i++) {
            long n=sc.nextLong();
            sc.nextLine();
            int count=0;
            if (n==1){
                count=0;
            } else {
                while (n != 1) {
                    if (n % 5 == 0) {
                        count++;
                        n = (4 * n) / 5;
                    } else if (n % 3 == 0) {
                        count++;
                        n = (2 * n) / 3;
                    } else if (n % 2 == 0) {
                        count++;
                        n = n / 2;
                    }
                    if (n!=1) {
                        if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0) {
                            count = -1;
                            break;
                        }
                    }
                }
            }
            ans[i]=count;
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
