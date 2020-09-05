import java.util.Scanner;
import java.lang.Math;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        sc.nextLine();
        int a=(k*l)/n;
        int b=(c*d);
        int cc=(p/np);
        int min=0;
        if (a<b && a<cc ){
            min=a;
        } else if (b<a && b<cc){
            min=b;
        } else if (cc<b && cc<a){
            min=cc;
        }
        int toast=min/n;
        System.out.println(toast);
    }
}
