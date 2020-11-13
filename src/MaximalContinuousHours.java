import java.util.Scanner;

public class MaximalContinuousHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] k=new int[n];
        for (int i = 0; i < n ; i++) {
            k[i]=sc.nextInt();
        }
        int count=0;
        int max=0;
        for (int i = 0; i < n*2 ; i++) {
            if (k[i%n]!=0){
              count++;
              max=Math.max(count,max);
            }else {
                count=0;
            }
        }
        System.out.println(max);

    }
}
