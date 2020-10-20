import java.util.Scanner;

public class NewYearCandles379A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); int m=sc.nextInt();
        sc.nextLine();
        int a=0;
        int count=n;
        while (n>=m){
            int h=n/m;
            int k=n%m;
            count+=h;
            n=h+k;
        }
        System.out.println(count);
    }
}
