import java.util.Scanner;

public class HexagonalNumbers130A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        sc.nextLine();
        long a= (long) (2*Math.pow(n,2)-n);
        System.out.println(a);
    }
}
