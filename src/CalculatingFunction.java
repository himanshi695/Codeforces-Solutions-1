import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        sc.nextLine();
        long fn = 0;
        if (n%2==0){
            fn=n/2;
        } else if (n%2!=0){
            fn=(-1)*((n/2)+1);
        }
        System.out.println(fn);
    }
}
