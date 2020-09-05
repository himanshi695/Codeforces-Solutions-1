import java.util.Scanner;

public class MagicalSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int[] k= new int[t];
        for (int i = 0; i < t ; i++) {
            int a=sc.nextInt();
            sc.nextLine();
            int p=(a+1)/2;
            k[i]=p;
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(k[i]);
        }
    }
}
