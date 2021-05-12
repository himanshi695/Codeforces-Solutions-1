import java.util.Scanner;

public class NastiaAndNearlyGoodNumbers1521A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0){
            long a=sc.nextInt(); long b=sc.nextInt();
            sc.nextLine();
            if (b==1){
                System.out.println("NO");
            } else{
                System.out.println("YES");
                System.out.print(a + " ");
                System.out.print(a*b + " ");
                System.out.print(a*b+a);
                System.out.println();
            }
        }
    }
}
