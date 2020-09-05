import java.util.Scanner;

public class FashionableLee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String[] k= new String[t];
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt();
            if (n%4==0){
                k[i]="YES";
            } else {
                k[i]="NO";
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(k[i]);
        }
    }
}
