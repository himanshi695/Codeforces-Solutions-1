import java.util.Scanner;

public class TheWizardOrz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String ans[]=new String[t];
        for (int i = 0; i < t ; i++) {
            long n=sc.nextInt();
            sc.nextLine();
            if (n==1){
                ans[i]="9";
            } else if (n==2){
                ans[i]="98";
            } else if (n==3){
                ans[i]="989";
            } else{
                String k = "989";
                n=n-3;
                long now=0;
                for (int j = 1; j <=n ; j++) {
                    k+=now;
                    now=(now+1)%10;
                }
                ans[i]=k;
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
