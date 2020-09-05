import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int k[] = new int[t];
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt();
            int p[] = new int[n];
            for (int j = 0; j < n ; j++) {
                p[j]=sc.nextInt();
            }
            Arrays.sort(p);
            int min=999999;
            for (int j = 0; j < n-1 ; j++) {
                int q=p[j+1]-p[j];
                if (p[j+1]-p[j]<min){
                    min=q;
                }
            }
            k[i]=min;
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(k[i]);
        }
    }
}
