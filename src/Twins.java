import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] coins=new int[n];
        int sum=0;
        for (int i = 0; i < n ; i++) {
            coins[i]=sc.nextInt();
            sum=sum+coins[i];
        }
        int halfSumm=sum/2;
        Arrays.sort(coins);
        int twinShare1=0;
        int count=0;
        for (int i = n-1; i >0  ; i--) {
            twinShare1=twinShare1+coins[i];
            if (twinShare1>halfSumm){
                break;
            } else{
                count++;
            }

        }
        System.out.println(count+1);

    }
}
