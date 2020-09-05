import java.util.Scanner;

public class Fafa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        int count=0;
        int k=a;
        a=a-1;
        while (a>0){
            if (k%(a)==0){
                count++;
            }
            a--;
        }
        System.out.println(count);
    }
}
