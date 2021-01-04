import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String sol[]=new String[t];
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            sc.nextLine();
            boolean flag=false;
            for (int j = 0; j < n ; j++) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                sc.nextLine();
                int c=sc.nextInt();
                int d=sc.nextInt();
                sc.nextLine();
                if (b==c){
                    flag=true;
                }
            }
            if (m%2==0 && flag){
                sol[i]="YES";
            } else{
                sol[i]="NO";
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(sol[i]);
        }
    }
}
