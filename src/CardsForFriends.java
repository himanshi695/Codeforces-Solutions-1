import java.util.Scanner;

public class CardsForFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String ans[]=new String[t];
        for (int i = 0; i < t ; i++) {
            int w=sc.nextInt();int h=sc.nextInt(); int n=sc.nextInt();
            sc.nextLine();
            int count=1;
            while (w%2==0){
                w=w/2;
                count=count*2;
            }
            while (h%2==0){
                h=h/2;
                count=count*2;
            }
            if(count>=n){
                ans[i]="YES";
            }else {
                ans[i]="NO";
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
