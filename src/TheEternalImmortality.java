import java.util.Scanner;

public class TheEternalImmortality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong(); long b=sc.nextLong();
        sc.nextLine();
        long mul=1;
        if (b-a>4){
            System.out.println("0");
        }else {
            for (long i = a + 1; i <= b; i++) {
                mul = (mul % 10) * (i % 10);
                if (mul % 10 == 0) {
                    break;
                }
            }
            System.out.println(mul % 10);
        }
    }
}

