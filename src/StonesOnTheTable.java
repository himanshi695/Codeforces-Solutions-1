import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        int a;
        int b;
        int count=0;
        int[] arr= new int[n];
        for (int i = 0; i < n ; i++) {
            a=sc.nextInt();
            b=sc.nextInt();
            sc.nextLine();
            while (a%b!=0){
                count++;
                a++;
            }
            arr[i]=count;
            count=0;
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(arr[i]);
        }

    }
}
