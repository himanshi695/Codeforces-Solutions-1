import java.util.Scanner;

public class CollectingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        String[] k = new String[t];
        for (int i = 0; i < t ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int q = sc.nextInt();
            sc.nextLine();
            int max=0;
            if (a>b && a>c){
                max=a;
            } else if (b>c && b> a){
                max=b;
            } else if (c>a && c>b){
                max=c;
            }
            int count=0;
            count=(max-a)+(max-b)+(max-c);
            if (count<=q){
                q=q-count;
                if (q%3==0){
                    k[i]="YES";
                }else{
                    k[i]="NO";
                }
            } else{

                k[i]="NO";
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(k[i]);
        }
    }
}
