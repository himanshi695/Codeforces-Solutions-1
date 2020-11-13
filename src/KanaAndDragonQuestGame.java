import java.util.Scanner;

public class KanaAndDragonQuestGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String[] sol = new String[t];
        for (int i = 0; i < t ; i++) {
            int x=sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < n; j++) {
                if (x>20) {
                    x = Math.floorDiv(x, 2) + 10;
                } else {
                    continue;
                }
            }
            for (int j = 0; j < m ; j++) {
                x=x-10;
            }
            if (x<0 || x==0){
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
