import java.util.Scanner;

public class DreamoonStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); int m=sc.nextInt();
        sc.nextLine();
        int k=n/2;
        int l=n%2;
        if (n<m){
            System.out.println("-1");
        } else if ((k+l)%m==0){
            System.out.println(k+l);
        }
        else if ((k+l)%m!=0){
            for (int i = k+l+1;; i++) {
                if (i%m==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
