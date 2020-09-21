import java.util.Scanner;

public class VasyaAndSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        int q=(n-1)/(m-1);
        System.out.println(n+q);
    }
}
