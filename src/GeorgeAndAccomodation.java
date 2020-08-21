import java.util.Scanner;

public class GeorgeAndAccomodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        int count=0;
        for (int i = 0; i < n ; i++) {
            int p =sc.nextInt();
            int q=sc.nextInt();
            sc.nextLine();
            if (q-p>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
