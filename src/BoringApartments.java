import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int ans[]=new int[t];
        for (int i = 0; i < t ; i++) {
            int count=0;
            int m=0;
            int k=sc.nextInt();
            sc.nextLine();
            if (k==1){
                ans[i]=1;
            } else {
                if (k > 1000) {
                    m = k / 1000;
                } else if (k > 100) {
                    m = k / 100;
                } else {
                    m = k / 10;
                }
                if (k < 10) {
                    count += 1;
                } else if (k < 100) {
                    count += 3;

                } else if (k < 1000) {
                    count += 6;
                } else if (k < 10000) {
                    count += 10;
                }
                ans[i] = ((m - 1) * 10) + count;
            }
        }
        for (int i = 0; i < ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
}
