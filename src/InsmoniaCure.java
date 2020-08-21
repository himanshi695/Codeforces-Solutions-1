import java.util.HashSet;
import java.util.Scanner;

public class InsmoniaCure {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int k =sc.nextInt();
        sc.nextLine();
        int l=sc.nextInt();
        sc.nextLine();
        int m=sc.nextInt();
        sc.nextLine();
        int n=sc.nextInt();
        sc.nextLine();
        int d=sc.nextInt();
        sc.nextLine();
        HashSet<Integer> a = new HashSet<Integer>();
        for (int i = k; i <=d ; i++) {
            if (i%k==0){
                a.add(i);
            }
        }
        for (int i = l; i <=d ; i++) {
            if (i%l==0){
                a.add(i);
            }
        }
        for (int i = m; i <=d ; i++) {
            if (i%m==0){
                a.add(i);
            }
        }
        for (int i = n; i <=d ; i++) {
            if (i%n==0){
                a.add(i);
            }
        }

        System.out.println(a.size());

    }
}
