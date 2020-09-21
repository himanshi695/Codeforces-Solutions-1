import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        int last=0;
        int current=0;
        while (a > 0) {
            i++;
            current = last + i;
            last = current;
            a -= current;
            if (a < 0) {
                i--;
            }
        }
        System.out.println(i);
    }
}
