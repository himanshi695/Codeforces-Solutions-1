import java.util.Scanner;
import java.lang.*;

public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < n ; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<b){
                sum2++;
            } else if(a>b){
                sum1++;
            } else if (a==b){
                continue;
            }
        }
        if (sum1>sum2){
            System.out.println("Mishka");
        } else if(sum2>sum1){
            System.out.println("Chris");
        } else if (sum1==sum2){
            System.out.println("Friendship is magic!^^");
        }
    }
}
