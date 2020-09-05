import java.util.Scanner;

public class Bachgold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println(a/2);
        if (a%2==0){
            for (int i = 0; i < a/2 ; i++) {
                System.out.print("2" + " ");
            }
        } else {
            for (int i = 0; i < (a/2)-1 ; i++) {
                System.out.print("2" + " ");
            }
            System.out.print("3");
        }

    }
}
