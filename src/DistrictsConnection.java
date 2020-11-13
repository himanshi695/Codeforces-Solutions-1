import java.util.Scanner;

public class DistrictsConnection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt();
            sc.nextLine();
            int arr[]=new int[n];
            for (int j = 0; j < n ; j++) {
                arr[i]=sc.nextInt();
            }
            for (int j = 0; j < n-1 ; j++) {
                for (int k = 0; k < n ; k++) {
                    for (int l = k+1; l < n ; l++) {
                        if (arr[k]!=arr[l]){
                            System.out.print(k+1);
                            System.out.print(l+1);
                        }
                    }
                }
            }
        }
    }
}
