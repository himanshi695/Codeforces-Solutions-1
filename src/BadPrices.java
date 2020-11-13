import java.util.Scanner;

public class BadPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int ans[]=new int[t];
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt();
            sc.nextLine();
            int count=0;
            int arr[]=new int[n];
            for (int j = 0; j < n ; j++) {
                arr[j]=sc.nextInt();
            }
            int min=Integer.MAX_VALUE;
            for (int j = n-1; j >=0 ; j--) {
                if (arr[j]>min){
                    count++;
                }
                min=Math.min(arr[j],min);
            }
            ans[i]=count;
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
