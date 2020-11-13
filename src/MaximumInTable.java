import java.util.Scanner;

public class MaximumInTable {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if (i==0){
                    arr[i][j]=1;
                } else if (j==0){
                    arr[i][j]=1;
                } else{
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];
                }
            }
        }
        System.out.println(arr[n-1][n-1]);

    }
}
